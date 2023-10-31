package pe.edu.smt.tes.rbc.reuse;

import java.util.ArrayList;
import java.util.List;

import pe.edu.smt.tes.rbc.retrieve.SMLabel;

public class RBCReuse {

	private static double vote(String[] labels, String query) {
		int size = labels.length;
		int cont = 0;
		for (int i = 0; i < size; i++) {
			if (query.equals(labels[i])) {
				cont += 1;
			}
		}
		return (double) cont / (double) size;
	}
	
	private static double sumDistance(String[] labels, double[] distances, String query) {
		double total = 0.0;
		for(int i=0; i<labels.length; i++) {
			if(query.equals(labels[i])) {
				total += distances[i];
			}
		}
		return total;
	}
	
	private static String labelCase(String[] labels, double[] distances) {
		
		double totalDistance = 0.0;
		double voto = 0.0;
		String label = "unkown";
		
		List<String> visited = new ArrayList<String>();
		//System.out.println();
		for (int i = 0; i < labels.length; i++) {
			//System.out.println(labels[i]+ " "+distances[i]);
			if (!visited.contains(labels[i])) {
				visited.add(labels[i]);
				double auxVoto = vote(labels, labels[i]);
				if (voto < auxVoto) {
					voto = auxVoto;
					label = labels[i];
					totalDistance = sumDistance(labels, distances, labels[i]);
				} else if (voto == auxVoto) {
					double auxSumDistance = sumDistance(labels, distances, labels[i]);
					if(auxSumDistance > totalDistance) {
						//System.out.println("Entra en caso desempate");
						//System.out.println("distancia mayor "+auxSumDistance);
						//System.out.println("distancia menor "+totalDistance);
						voto = auxVoto;
						label = labels[i];
						totalDistance = auxSumDistance;
					}
					
				}
			}
		}
		
		return label;
	}
	
	public static String reuse(List<SMLabel> smLabels, int neighbors) {
		
		String[] labels = new String[neighbors];
		double[] measures = new double[neighbors];
		for (int i = 0; i < neighbors; i++) {
			labels[i] = smLabels.get(i).getLabel();
			measures[i] = smLabels.get(i).getSimilarityMeasure();
		}
		return labelCase(labels, measures);
				
	}
	
}
