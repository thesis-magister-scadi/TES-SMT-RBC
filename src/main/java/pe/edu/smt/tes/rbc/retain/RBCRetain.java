package pe.edu.smt.tes.rbc.retain;

import java.util.List;

import pe.edu.smt.tes.domain.RBCCaso;

public class RBCRetain {

	public static List<RBCCaso> retain(List<RBCCaso> cases, RBCCaso query, boolean decision) {
		if(cases == null || cases.isEmpty()) {
			System.out.println("Conjunto de casos vacios");
			return null;
		}
		if (decision)
			cases.add(query);
		return cases;
	}

}
