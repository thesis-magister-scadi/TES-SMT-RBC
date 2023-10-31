package pe.edu.smt.tes.rbc.retrieve;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.ArffSaver;

public class RBCMeasure {
	
	public static Instances getDataSet(String fileName) throws IOException {
		/**
		 * we can set the file i.e., loader.setFile("finename") to load the data
		 */
		int classIdx = 1;
		/** the arffloader to load the arff file */
		ArffLoader loader = new ArffLoader();
		/** load the traing data */
		loader.setSource(RBCMeasure.class.getResourceAsStream("/res/"+fileName));
		/**
		 * we can also set the file like loader3.setFile(new
		 * File("test-confused.arff"));
		 */
		//loader.setFile(new File(fileName));
		Instances dataSet = loader.getDataSet();
		/** set the index based on the data given in the arff files */
		dataSet.setClassIndex(classIdx);
		return dataSet;
	}
	
	public static void process() throws Exception {
		Instances data = getDataSet("SCADI.arff");
		//Instances dataTest = getDataSet("SCADI-TEST.arff");

		data.setClassIndex(data.numAttributes() - 1);
		
		//randomize data
		int seed = 1;
		int folds = 10;
		
		Random rand = new Random(seed);
		
		//create random dataset
		Instances randData = new Instances(data);
		randData.randomize(rand);
		
		//stratify	    
		if (randData.classAttribute().isNominal())
			randData.stratify(folds);
		
		//k - the number of nearest neighbors to use for prediction
		Classifier ibk = new IBk(1);		
		ibk.buildClassifier(data);
		
		System.out.println(ibk);
		
		for(int n = 0; n < folds; n++) {
			Instances train = randData.trainCV(folds, n);
			Instances test = randData.testCV(folds, n);	      

			ArffSaver saver = new ArffSaver();
			saver.setInstances(train);
			System.out.println("No of folds done = " + (n+1));

			saver.setFile(new File("trainheadbraina"+n+".arff"));
			saver.writeBatch();
			//if(n==9)
			//{System.out.println("Training set generated after the final fold is");
			//System.out.println(train);}

			ArffSaver saver1 = new ArffSaver();
			saver1.setInstances(test);
			saver1.setFile(new File("testheadbraina"+n+".arff"));
			saver1.writeBatch();
		}
	
		
       /*
        Evaluation eval = new Evaluation(data);
        eval.evaluateModel(ibk, data);*/
		/** Print the algorithm summary */
		/*System.out.println("** KNN Demo  **");
		System.out.println(eval.toSummaryString());
	    System.out.println(eval.toClassDetailsString());
		System.out.println(eval.toMatrixString());*/
	}
	
	public static void process2() {
//		Common setting's to execute NN and K-NN 
		String dataSourceToLearn = "carro.arff";
		int classIndex = 6;
		int classPossibilites = 4;
				
//		Nearest Neighbor data to classify and run
		String dataSourceToClassify = "carro-a-classificar.arff";
		System.out.println(dataSourceToClassify);
//		Running NN		
		//NearestNeighbor nn;
		
		System.out.println("\n==========Using Nearest Neighbor==========\n");
		//nn = new NearestNeighbor(dataSourceToLearn, dataSourceToClassify, classIndex, classPossibilites);
		//System.out.println(nn.getResults());
		
//		Specific settings to execute K-NN, number of partitions, iterations and neighbors
//		The selected method is Leave on Out using the number of instances to Iterate and Partitioning
		int partitions = 1500;
		int iterations = 1500;
		int neighbors = 3;
		
//		Running	K-NN	
		KNearestNeighbor knn;
		
		System.out.println("\n=========Using K-NearestNeighbor=========\n");
		knn = new KNearestNeighbor(partitions, iterations, dataSourceToLearn, classIndex, classPossibilites, neighbors);
		System.out.println(knn.getResults());
	}
	
	public static void process3() throws Exception {
		Instances data = getDataSet("SCADI.arff");
		//Instances dataTest = getDataSet("SCADI-TEST.arff");

		data.setClassIndex(data.numAttributes() - 1);
		
		//k - the number of nearest neighbors to use for prediction
		Classifier ibk = new IBk(1);		
		ibk.buildClassifier(data);
			
        Evaluation eval = new Evaluation(data);
        eval.evaluateModel(ibk, data);
		/** Print the algorithm summary */
		System.out.println("** KNN Demo  **");
		System.out.println(eval.toSummaryString());
	    System.out.println(eval.toClassDetailsString());
		System.out.println(eval.toMatrixString());
	}
	
}
