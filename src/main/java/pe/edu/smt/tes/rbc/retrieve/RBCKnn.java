package pe.edu.smt.tes.rbc.retrieve;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import pe.edu.smt.tes.domain.RBCCaso;

public class RBCKnn {
	
	private static double[] generateWeights(int size) {
		double[] weights = new double[size];
		for(int i=0; i<size; i++) {
			weights[i] = 1;
		}
		return weights;
	}

	private static double calculateEuclidianDistance(double[] weight, String[] elements, String[] query) {
		Double sum = 0.0;
		if (elements.length != query.length) {
			System.out.println("Numero de caracteristicas son diferentes");
			return 0.0;
		}
		int size = elements.length;
		for (int i = 0; i < size; i++) {
			sum += Math.pow(weight[i], 2)*Math.pow(Integer.parseInt(elements[i]) - Integer.parseInt(query[i]), 2);
		}
		return Math.sqrt(sum);
	}
	
	private static double calculateCommonFeatures(String[] elements, String[] query, double alpha, double betha) {
		int size = query.length;
		int common = 0;
		int different = 0;
		
		for(int i=0; i<size; i++) {
			if(Integer.parseInt(elements[i]) == Integer.parseInt(query[i])) {
				common += 1;
			} else {
				different +=1;
			}
		}
		
		return (alpha*(double)common)/(alpha*((double)common)+betha*((double)different));
	}

	/*
	private static String labelCase(String[] labels, double[] distances, int neighbors) {
		
		double totalDistance = 0.0;
		double voto = 0.0;
		String label = "unkown";
		
		List<String> visited = new ArrayList<String>();
		
		for (int i = 0; i < labels.length; i++) {
			if (!visited.contains(labels[i])) {
				visited.add(labels[i]);
				double auxVoto = vote(labels, labels[i]);
				if (voto < auxVoto) {
					//System.out.println("Label: " + labels[i] + " Vote: " + auxVoto);
					voto = auxVoto;
					label = labels[i];
					totalDistance = sumDistance(labels, distances, labels[i]);
				} else if (voto == auxVoto) {
					double auxSumDistance = sumDistance(labels, distances, labels[i]);
					if(auxSumDistance < totalDistance) {
						voto = auxVoto;
						label = labels[i];
						totalDistance = auxSumDistance;
					}
				}
			}
		}
		
		return label;
	}
	*/
	
	/*
	public static String KnnEuclidianDistance(List<RBCCaso> cases, RBCCaso query, int neighbors) {
		if (cases == null || cases.isEmpty()) {
			System.out.println("Conjunto de datos vacio");
			return "Unknow";
		}
		
		int numFeatures = query.getFeatures().length;
		
		List<SMLabel> smLabels = cases.stream().map( caso -> {
			SMLabel smLabel = new SMLabel();
			smLabel.setSimilarityMeasure(calculateEuclidianDistance(generateWeights(numFeatures), caso.getFeatures(), query.getFeatures()));
			smLabel.setLabel(caso.getLabel());
			return smLabel;
		}).collect(Collectors.toList());

		Collections.sort(smLabels, (p, q) -> p.getSimilarityMeasure().compareTo(q.getSimilarityMeasure()));

		String[] labels = new String[neighbors];
		double[] distances = new double[neighbors];
		for (int i = 0; i < neighbors; i++) {
			labels[i] = smLabels.get(i).getLabel();
			distances[i] = smLabels.get(i).getSimilarityMeasure();
			System.out.println(
					"Distancia vecino -> " + smLabels.get(i).getSimilarityMeasure() + " Label -> " + smLabels.get(i).getLabel());
		}

		return labelCase(labels, distances, neighbors);
	}
	*/
	
	/*
	public static String KnnCommonFeatures(List<RBCCaso> cases, RBCCaso query, int neighbors) {
		if (cases == null || cases.isEmpty()) {
			System.out.println("Conjunto de datos vacio");
			return "Unknow";
		}
		
		List<SMLabel> smLabels = cases.stream().map( caso -> {
			SMLabel smLabel = new SMLabel();
			smLabel.setSimilarityMeasure(calculateCommonFeatures(caso.getFeatures(), query.getFeatures(),1,1));
			smLabel.setLabel(caso.getLabel());
			return smLabel;
		}).collect(Collectors.toList());
		
		Collections.sort(smLabels, (p, q) -> p.getSimilarityMeasure().compareTo(q.getSimilarityMeasure()));
		Collections.reverse(smLabels);
		
		String[] labels = new String[neighbors];
		double[] measures = new double[neighbors];
		for (int i = 0; i < neighbors; i++) {
			labels[i] = smLabels.get(i).getLabel();
			measures[i] = smLabels.get(i).getSimilarityMeasure();
		}
		
		return labelCase(labels, measures, neighbors);
	}
	*/
	
	public static List<SMLabel> retrieveEuclidianDistance(List<RBCCaso> cases, RBCCaso query) {
		if (cases == null || cases.isEmpty()) {
			System.out.println("Conjunto de datos vacio");
			return null;
		}
		
		int numFeatures = query.getFeatures().length;
		
		List<SMLabel> smLabels = cases.stream().map( caso -> {
			SMLabel smLabel = new SMLabel();
			smLabel.setSimilarityMeasure(calculateEuclidianDistance(generateWeights(numFeatures), caso.getFeatures(), query.getFeatures()));
			smLabel.setLabel(caso.getLabel());
			return smLabel;
		}).collect(Collectors.toList());

		Collections.sort(smLabels, (p, q) -> p.getSimilarityMeasure().compareTo(q.getSimilarityMeasure()));

		return smLabels;
	}
	
	public static List<SMLabel> retrieveCommonFeatures(List<RBCCaso> cases, RBCCaso query) {
		if (cases == null || cases.isEmpty()) {
			System.out.println("Conjunto de datos vacio");
			return null;
		}
		
		List<SMLabel> smLabels = cases.stream().map( caso -> {
			SMLabel smLabel = new SMLabel();
			smLabel.setSimilarityMeasure(calculateCommonFeatures(caso.getFeatures(), query.getFeatures(),1,1));
			smLabel.setLabel(caso.getLabel());
			return smLabel;
		}).collect(Collectors.toList());
		
		Collections.sort(smLabels, (p, q) -> p.getSimilarityMeasure().compareTo(q.getSimilarityMeasure()));
		Collections.reverse(smLabels);
		
		return smLabels;
	}

}
