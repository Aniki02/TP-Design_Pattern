import binaire.Fois;
import binaire.Plus;
import operation.Operation;
import unaire.Exposant;
import variable.Constante;
import variable.Variable;

public class TestOp {

	public static void main(String[] args) {
		
		Operation c = new Constante(7); 
		
		System.out.println("1. f(x) = "+c+ "=" + c.calculer(0));
		
		Operation v = new Variable();
		Operation p = new Plus(c, v);
		
		System.out.println("2. f(x) = "+p+" = "+p.calculer(2));
	
		Operation f = new Fois(p, p);
		System.out.println("3. f(x) = "+f +" = "+ f.calculer(2));
		
		
		/////////////////////////////////:
		
		Operation c1 = new Constante(5.2f);
		Operation c2 = new Constante(1);
		
		Operation e = new Exposant(new Variable(), 2);
		Operation p1 = new Plus(e, c2);
		Operation e1 = new Exposant(p1, 5);
		
		
		Operation f1 = new Fois (c1, e1);
		
		System.out.println("5. f(x) = "+f1 +" = "+ f1.calculer(2));

	}

}
