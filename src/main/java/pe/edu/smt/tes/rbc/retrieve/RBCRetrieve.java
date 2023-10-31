package pe.edu.smt.tes.rbc.retrieve;

import java.util.List;

import pe.edu.smt.tes.domain.RBCCaso;

public class RBCRetrieve {
	
	public static List<SMLabel> retrieve(List<RBCCaso> cases, RBCCaso query) {		
		return RBCKnn.retrieveCommonFeatures(cases, query);
		//return RBCKnn.retrieveEuclidianDistance(cases, query);
	}
	
}
