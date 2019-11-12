package variable;

import operation.Operation;

public class Constante implements Operation{
	float constante;

	public Constante(float constante) {
		super();
		this.constante = constante;
	}

	@Override
	public float calculer(float valeurX) {
		// TODO Auto-generated method stub
		return constante;
	}

	@Override
	public String toString() {
		return ""+constante;
	}
	
	
	
}
