package unaire;

import operation.Operation;

public class Exposant extends Unaire{
	int exposant;
	public Exposant(Operation operande, int exposant) {
		super(operande);
		this.exposant = exposant;
	}

	@Override
	public float calculer(float valeurX) {
		// TODO Auto-generated method stub
		float res = 1;
		for (int i = 0; i < exposant; i++) {
			res*=this.getOperande().calculer(valeurX);
		}
		return res;
	}

	@Override
	public String toString() {
		return "("+this.getOperande()+")"+"^" + exposant;
	}
	
	

}
