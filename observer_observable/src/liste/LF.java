package liste;

import personne.Personne;

public class LF extends LP{
	
	public LF() {
		super();
	}
	
	public void add(Personne p) {
		if (! vP.contains(p) && p.getSexe().equals("feminin")) {
			vP.add(p);
			this.setChanged();
			this.notifyObservers(p);
		}
	}
	
	@Override
	public String toString() {
		String s = "Liste Femme [ ";
		for (Personne personne : vP) {
			s += personne.toString() + ", ";
		}
		return s + "]";
	}
	
}
