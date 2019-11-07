package personne;

public class Femme extends Personne{

	public Femme(String nom, String prenom, int anneeNaissance) {
		super(nom, prenom, anneeNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSexe() {
		// TODO Auto-generated method stub
		return "feminin";
	}
	
	

}
