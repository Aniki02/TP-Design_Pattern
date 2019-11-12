package binaire;

import operation.Operation;

public class Plus extends Binaire{

	public Plus(Operation gauche, Operation droite) {
		super(gauche, droite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculer(float valeurX) {
		// TODO Auto-generated method stub
		return this.getGauche().calculer(valeurX) + this.getDroite().calculer(valeurX);
	}

	@Override
	public String toString() {
		return "( " + this.getGauche() + " + " + this.getDroite() + " )";
	}
	
	
	
}
