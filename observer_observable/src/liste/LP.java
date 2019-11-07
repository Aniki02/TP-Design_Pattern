package liste;



import java.util.Vector;

import observ.Observable;
import observ.Observer;
import personne.Personne;

public class LP extends Observable<Personne> implements Observer<Personne>{

	Vector<Personne> vP;
	
	public LP() {
		vP = new Vector<Personne>();
	}
	@Override
	public void update(Observable<Personne> o, Personne p) {
		// TODO Auto-generated method stub
		
		if (p == null) throw new IllegalArgumentException("Personne est null");
		this.add(p);
		
	}

	public void add(Personne p) {
		// TODO Auto-generated method stub
		if (! vP.contains(p)) {
			vP.add(p);
			this.setChanged();
			this.notifyObservers(p);
		}
		
	}
	
	public int size() {
		return vP.size();
	}


	public boolean contains(Object o) {
		return vP.contains(o);
	}


	public int indexOf(Object o) {
		return vP.indexOf(o);
	}


	public boolean remove(Object o) {
		return vP.remove(o);
	}

	public Personne get(int index) {
		return vP.get(index);
	}
	@Override
	public String toString() {
		String s = "Liste Personne [ ";
		for (Personne personne : vP) {
			s += personne.toString() + ", ";
		}
		return s + "]";
	}

	
	
}
