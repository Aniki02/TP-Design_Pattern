package liste;

import java.util.Vector;

import observ.Observable;
import observ.Observer;
import personne.Personne;

public class LPXX implements Observer<Personne>{

	Vector<Personne> vP;
	
	public LPXX () {
		vP = new Vector<Personne>();
	}
	
	@Override
	public void update(Observable<Personne> o, Personne p) {
		// TODO Auto-generated method stub
		if (! vP.contains(p) && (p.getAnneeNaissance() < 2000 && p.getAnneeNaissance() >= 1900)) {	
			vP.add(p);
		}
		
	}
	
	public int size() {
		return vP.size();
	}

	public boolean contains(Object o) {
		return vP.contains(o);
	}

	public boolean add(Personne e) {
		return vP.add(e);
	}

	public boolean remove(Object o) {
		return vP.remove(o);
	}
	
	@Override
	public String toString() {
		String s = "Liste Personne XX [ ";
		for (Personne personne : vP) {
			s += personne.toString() + ", ";
		}
		return s + "]";
	}

}
