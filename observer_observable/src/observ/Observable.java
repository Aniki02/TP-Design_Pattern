package observ;

import java.util.Vector;

public class Observable<T> {
	Vector<Observer<T>> observers;
	boolean hasChanged;
	
	
	public Observable() {
		super();
		observers = new Vector<Observer<T>>();
		hasChanged = false;
	}
	
	public void addObserver (Observer<T> o){
		if (o == null ) throw new IllegalArgumentException("observer est vide");
		observers.add(o);
	}
	
	protected void clearChanged() {
		hasChanged = false;
	}
	
	public int countObservers() {
		return observers.size();
		
	}
	
	public void deleteObserver(Observer<T> o) {
		if (!observers.remove(o)) throw new IllegalArgumentException("observer non present");
	}
	
	public boolean hasChanged() {
		return hasChanged;
	}
	
	public void notifyObservers() {
		notifyObservers(null);
		
	}
	
	public void notifyObservers(T arg) {
		for (Observer<T> observer : observers) {
			observer.update(this, arg);
		}
		
		this.clearChanged();
	}
	
	public void setChanged() {
		hasChanged = true;
	}
	
	
	
}
