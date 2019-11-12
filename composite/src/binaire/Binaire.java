package binaire;

import operation.Operation;

public abstract class Binaire implements Operation{
	
	private Operation gauche, droite;

	public Binaire(Operation gauche, Operation droite) {
		super();
		this.gauche = gauche;
		this.droite = droite;
	}

	public Operation getGauche() {
		return gauche;
	}

	public void setGauche(Operation gauche) {
		this.gauche = gauche;
	}

	public Operation getDroite() {
		return droite;
	}

	public void setDroite(Operation droite) {
		this.droite = droite;
	}

	@Override
	public String toString() {
		return "Binaire [gauche=" + gauche + ", droite=" + droite + "]";
	}

}
