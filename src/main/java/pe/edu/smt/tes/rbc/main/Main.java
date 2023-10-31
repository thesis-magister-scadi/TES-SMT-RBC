package pe.edu.smt.tes.rbc.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.edu.smt.tes.domain.RBCCaso;
import pe.edu.smt.tes.rbc.retain.RBCRetain;
import pe.edu.smt.tes.rbc.retrieve.RBCDataSource;
import pe.edu.smt.tes.rbc.retrieve.RBCRetrieve;
import pe.edu.smt.tes.rbc.reuse.RBCReuse;

public class Main {

	public static void main(String args[]) throws FileNotFoundException, IOException {
		String indexTrain1 = "57, 47, 16, 34, 42, 28,  7, 53, 40, 44, 46, 19, 56, 39, 25, 38, 13,\n" + 
				"50,  3, 17,  8, 55,  6, 36, 64, 69, 68, 15, 27, 41, 26, 48, 24, 59,\n" + 
				"63, 11, 32, 66, 61, 37, 29, 43, 65,  1, 52, 21,  2, 23, 20, 60, 14,\n" + 
				"51";
		
		String indexTest1 = "22,  0, 49,  4, 54, 18, 10, 33, 45, 12, 31,  9, 67,  5, 62, 30, 58,\n" + 
				"35";
		
		
		//split 2
		
		String indexTrain2 = "55, 37, 29, 48, 26, 21, 57, 33,  2, 38, 45, 30, 22, 15, 66, 11, 42,\n" + 
				"       50, 51, 27,  4, 32, 41, 34, 46, 16, 10, 49,  7, 43, 53, 64,  8,  6,\n" + 
				"       62,  0, 58, 68, 28, 40, 44, 60, 67, 59, 24, 25, 23, 52, 39, 61, 14,\n" + 
				"       47";
		
		String indexTest2 = "17, 18,  1,  5,  3, 31, 65, 63, 69, 35, 54, 12, 36,  9, 19, 56, 20,\n" + 
				"       13";
		
		
		//split 3
		
		String indexTrain3 = "55, 49, 57, 62, 11, 30, 25, 16, 48, 34, 33, 59, 65, 68, 23, 67,  8,\n" + 
				"       40,  7, 53,  2, 64, 26,  0, 32, 38, 24, 51, 10, 29, 19, 60, 43, 54,\n" + 
				"       61,  5, 52, 44, 41,  1, 27, 21, 50, 58,  6, 31, 12, 35, 28, 42, 14,\n" + 
				"       22";
		
		String indexTest3 = "15,  9,  3, 13, 66, 45, 39, 17, 47, 37, 69, 20, 63, 46, 56, 36, 18,\n" + 
				"        4";
		
		
		//split 4
		
		String indexTrain4 = "11, 63, 45,  1, 64, 40, 69, 49, 38, 42,  9, 29, 22, 36, 24, 27, 65,\n" + 
				"        0, 17, 52,  6, 67, 46, 44, 66, 25, 18, 35, 19,  2, 28, 53, 57,  8,\n" + 
				"       32, 15, 47, 10, 21,  5, 33, 51,  4, 23, 37, 62, 16, 55, 54, 68, 31,\n" + 
				"       43";
		
		String indexTest4 = "30, 56, 13, 41,  7, 20, 50,  3, 48, 14, 58, 12, 59, 26, 34, 61, 39,\n" + 
				"       60";
		
		
		//split 5
		
		String indexTrain5 = "25,  5, 36, 55, 46, 67, 48, 49, 57, 18, 62, 28, 41,  4, 63, 27, 64,\n" + 
				"       43, 54, 33, 39, 26, 51, 42, 68, 29, 45, 21, 11, 56, 16,  2,  6,  7,\n" + 
				"       19, 47, 20, 13, 58,  3, 32, 69, 40, 60, 15, 34, 53, 65, 17, 24, 37,\n" + 
				"       35";
		
		String indexTest5 = "66, 52,  1,  9, 22, 10, 50, 59, 14, 38, 44, 30, 23,  0, 12, 61, 31,\n" + 
				"        8";
		
		
		//split 6
		
		String indexTrain6 = "69,  5,  9, 54, 55, 63, 64, 44, 18, 62, 33, 30, 68, 27, 14, 61, 11,\n" + 
				"       13, 15,  7,  0, 19, 35,  6, 12, 65, 24, 34, 56, 58, 28, 38, 47, 42,\n" + 
				"        8, 32, 39, 16, 25, 60, 41, 26,  1, 22, 21, 46, 31, 23, 45, 66, 57,\n" + 
				"       53";
		
		String indexTest6 = "59, 29, 36, 20,  2, 52, 17, 43,  3, 50, 40, 51, 67, 48, 37, 49,  4,\n" + 
				"       10";
		
		
		//split 7
		
		String indexTrain7 = "26, 45,  3,  6, 20, 48, 61, 43, 50, 19, 51, 67, 14, 42, 27, 13, 40,\n" + 
				"       41, 55, 60, 56,  2, 28, 21,  4, 38, 15, 53, 44, 39, 24, 47, 31, 33,\n" + 
				"       46, 63,  0, 59, 11,  8, 22, 52, 66, 36, 25, 54, 57, 68, 62, 16, 18,\n" + 
				"       29";
		
		String indexTest7 = "64, 30, 10,  5, 34, 35, 69,  7, 32, 37, 49, 12, 17, 23,  1, 58, 65,\n" + 
				"        9";
		
		
		//split 8
		
		String indexTrain8 = "15, 21, 52, 57,  8,  4, 37, 29, 69, 20, 24, 35, 68, 54, 10,  3,  6," + 
				"       33, 38, 53, 41, 61,  7, 25, 16, 22, 65,  1, 45, 30, 58, 12, 28, 43," + 
				"       62,  9, 39, 63,  0,  2, 67, 36, 42, 50, 60, 64, 32, 34, 49, 11, 23," + 
				"       31";
		
		String indexTest8 = "17, 51, 46, 66,  5, 14, 19, 55, 26, 13, 56, 48, 47, 18, 40, 44, 27," + 
				"       59";
		
		
		//split 9
		
		String indexTrain9 = "1, 33, 31, 39,  7, 69, 63, 59,  5, 16, 32, 25,  9, 64, 49, 17, 10,\n" + 
				"       28, 45, 50, 55, 56, 57, 43, 41, 38, 52, 22, 35, 20, 24, 61, 34,  4,\n" + 
				"       15, 46, 62, 51, 30, 13, 27,  6,  8, 65, 67, 40, 60, 11, 48, 18, 58,\n" + 
				"       12";
		
		String indexTest9 = "37, 14, 54, 21, 68, 47, 66, 29, 53,  3, 44,  0, 23, 36,  2, 26, 19,\n" + 
				"       42";
		
		
		//split 10
		
		String indexTrain10 = "9, 11, 52, 66, 50, 47, 21, 39, 51, 42, 13, 16,  8, 14, 17, 56, 64,\n" + 
				"       34, 35, 36, 10, 41, 15, 20, 31, 43,  5, 37, 32, 24, 55, 59, 62,  0,\n" + 
				"       63, 40,  7, 57, 19, 27, 49, 12, 44,  2, 61, 65, 68, 38, 53, 60, 18,\n" + 
				"       30";
		
		String indexTest10 = "58, 22, 26, 46,  6, 69, 25,  1,  3, 45, 28,  4, 48, 29, 33, 67, 54,\n" + 
				"       23";
		
		int itr = 10;
		int split = 10;
		String[] trainSet = new String[split];
		trainSet[0] = indexTrain1;		
		trainSet[1] = indexTrain2;
		trainSet[2] = indexTrain3;
		trainSet[3] = indexTrain4;
		trainSet[4] = indexTrain5;
		trainSet[5] = indexTrain6;
		trainSet[6] = indexTrain7;
		trainSet[7] = indexTrain8;
		trainSet[8] = indexTrain9;
		trainSet[9] = indexTrain10;
		
		
		String[] testSet = new String[split];
		testSet[0] = indexTest1;		
		testSet[1] = indexTest2;
		testSet[2] = indexTest3;
		testSet[3] = indexTest4;
		testSet[4] = indexTest5;
		testSet[5] = indexTest6;
		testSet[6] = indexTest7;
		testSet[7] = indexTest8;
		testSet[8] = indexTest9;
		testSet[9] = indexTest10;
		
		double[] accuracies = new double[split];
		
		// 89.4%
		//String featuresChain = "0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0";
		// 90.1%
		//String featuresChain = "0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0";
		// 90.5%
		//String featuresChain = "0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1";
		// 91.1
		String featuresChain = "1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0";

		String[] features = featuresChain.split(",");
		
		int oneTotal = 0;
		int[] newCrom = new int[205];
		for(int i=0; i<205; i++) {
			newCrom[i] = Integer.parseInt(features[i].trim());
			if(features[i].trim().equals("1")) oneTotal++;
		}
		
		System.out.println(oneTotal);
		
		for(int i=0; i<itr; i++) {
			accuracies[i] = run(newCrom, trainSet[i], testSet[i], 5);
		}
		System.out.println("accuracies: "+Arrays.toString(accuracies));
		System.out.println(accurary(accuracies));
		
		//System.out.println(runRBC(indexTrain4, indexTest4, 5));
	}
	
	private static double run(String trainSet, String testSet, int neighbors) throws FileNotFoundException, IOException {
		List<RBCCaso> cases = RBCDataSource.getDataSet("/home/luis/Documents/dataset/SCADI.csv", ",");
		List<String> labels = new ArrayList<String>();
		
		boolean decision = true;
		
		String[] train = trainSet.split(",");
		String[] test = testSet.split(",");
		
		List<RBCCaso> trainCases = new ArrayList<RBCCaso>();
		for(int i=0; i<train.length; i++) {
			trainCases.add(cases.get(Integer.parseInt(train[i].trim())));
			if(!labels.contains(cases.get(Integer.parseInt(train[i].trim())).getLabel())) {
				labels.add(cases.get(Integer.parseInt(train[i].trim())).getLabel());
			}
		}
		
		List<RBCCaso> testCases = new ArrayList<RBCCaso>();
		String[] labelReals = new String[test.length];
		for(int i=0; i<test.length; i++) {
			testCases.add(cases.get(Integer.parseInt(test[i].trim())));
			labelReals[i]=cases.get(Integer.parseInt(test[i].trim())).getLabel();
			if(!labels.contains(cases.get(Integer.parseInt(train[i].trim())).getLabel())) {
				labels.add(cases.get(Integer.parseInt(train[i].trim())).getLabel());
			}
		}
		
		//System.out.println(labels.toString());
		
		for(RBCCaso query : testCases) {
			query.setLabel(RBCReuse.reuse(RBCRetrieve.retrieve(trainCases, query), neighbors));
			trainCases = RBCRetain.retain(trainCases, query, decision);
		}
		
		int correct = 0;
		
		for(int k=0; k<test.length; k++) {
			System.out.println("Id -> "+testCases.get(k).getId()+" , Real -> "+labelReals[k]+" , Predic -> "+testCases.get(k).getLabel());
			if(testCases.get(k).getLabel().equals(labelReals[k])) {
				correct += 1;
			}
		}
			
		return (((double)correct*100)/(double)test.length);
	}
	
	public static double run(int[] cromosome, String trainSet, String testSet, int neighbors) throws FileNotFoundException, IOException {
		List<RBCCaso> cases = RBCDataSource.getDataSetWithFilterFeatures("/home/luis/Documents/dataset/SCADI.csv", ",",cromosome);
		List<String> labels = new ArrayList<String>();
		
		boolean decision = true;
		
		String[] train = trainSet.split(",");
		String[] test = testSet.split(",");
		
		List<RBCCaso> trainCases = new ArrayList<RBCCaso>();
		for(int i=0; i<train.length; i++) {
			trainCases.add(cases.get(Integer.parseInt(train[i].trim())));
			if(!labels.contains(cases.get(Integer.parseInt(train[i].trim())).getLabel())) {
				labels.add(cases.get(Integer.parseInt(train[i].trim())).getLabel());
			}
		}
		
		List<RBCCaso> testCases = new ArrayList<RBCCaso>();
		String[] labelReals = new String[test.length];
		for(int i=0; i<test.length; i++) {
			testCases.add(cases.get(Integer.parseInt(test[i].trim())));
			labelReals[i]=cases.get(Integer.parseInt(test[i].trim())).getLabel();
			if(!labels.contains(cases.get(Integer.parseInt(train[i].trim())).getLabel())) {
				labels.add(cases.get(Integer.parseInt(train[i].trim())).getLabel());
			}
		}
		
		//System.out.println(labels.toString());
		
		for(RBCCaso query : testCases) {
			query.setLabel(RBCReuse.reuse(RBCRetrieve.retrieve(trainCases, query), neighbors));
			trainCases = RBCRetain.retain(trainCases, query, decision);
		}
		
		int correct = 0;
		
		System.out.println("*****************FOLD**************** ");
		for(int k=0; k<test.length; k++) {
			System.out.println("Id -> "+testCases.get(k).getId()+" , Real -> "+labelReals[k]+" , Predic -> "+testCases.get(k).getLabel());
			if(testCases.get(k).getLabel().equals(labelReals[k])) {
				correct += 1;
			}			
		}
		
			
		return (((double)correct*100)/(double)test.length);
	}
	
	public static void confusionMatrix(List<String> labels) {
		
	}
	
	public static double accurary(double[] accuracies) {
		double total = 0.0;
		for(int i = 0; i<accuracies.length; i++) {
			//System.out.println(accuracies[i]);
			total += accuracies[i];
		}
		return (total/(double)accuracies.length);
	}
	
}
