package app;

import liste.LF;
import liste.LFXX;
import liste.LP;
import liste.LPXX;
import personne.Femme;
import personne.Homme;
import personne.Personne;

public class App {

	public static void main(String[] args) {
		LP listePersonne = new LP();
		LF listeFemme = new LF();
		LPXX listePersonneXX = new LPXX();
		LFXX listeFemmeXX = new LFXX();
		
		listePersonne.addObserver(listeFemme);
		listePersonne.addObserver(listeFemmeXX);
		listePersonne.addObserver(listePersonneXX);
		
		listeFemme.addObserver(listePersonne);
		listeFemme.addObserver(listeFemmeXX);
		listeFemme.addObserver(listePersonneXX);
		
		
		Personne melanie = new Femme("melanie", "mollineri", 1992);
		Personne brahim = new Homme("brahim", "zitoun", 1994);
		
		listeFemme.add(melanie);
		listePersonne.add(brahim);
		
		
		System.out.println(listePersonne);
		System.out.println(listeFemme);
		System.out.println(listeFemmeXX);
		System.out.println(listePersonneXX);

	}

}
