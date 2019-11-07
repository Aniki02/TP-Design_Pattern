package observ;


public interface Observer<T> {
	void update(Observable<T> o, T t);
}
