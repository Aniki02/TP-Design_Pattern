package unaire;

import operation.Operation;

public class MoinUnaire extends Unaire{

	public MoinUnaire(Operation operande) {
		super(operande);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculer(float valeurX) {
		// TODO Auto-generated method stub
		return -this.getOperande().calculer(valeurX);
	}

	@Override
	public String toString() {
		return "-("+this.getOperande()+")";
	}
	
	

}
