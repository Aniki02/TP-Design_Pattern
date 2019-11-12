package unaire;

import operation.Operation;

public abstract class Unaire implements Operation{
	Operation operande;

	public Unaire(Operation operande) {
		super();
		this.operande = operande;
	}

	public Operation getOperande() {
		return operande;
	}

	public void setOperande(Operation operande) {
		this.operande = operande;
	}

	@Override
	public String toString() {
		return "(" + operande + ")";
	}
	
	
}
