package personne;

public class Homme extends Personne{

	public Homme(String nom, String prenom, int anneeNaissance) {
		super(nom, prenom, anneeNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSexe() {
		// TODO Auto-generated method stub
		return "masculin";
	}
	
	

}
