package pe.edu.smt.tes.rbc.retrieve;

import java.io.Serializable;

public class SMLabel implements Serializable{

	private static final long serialVersionUID = 175816096686710179L;

	private Double similarityMeasure;
	
	private String label;

	public Double getSimilarityMeasure() {
		return similarityMeasure;
	}

	public void setSimilarityMeasure(Double similarityMeasure) {
		this.similarityMeasure = similarityMeasure;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}	
	
}
