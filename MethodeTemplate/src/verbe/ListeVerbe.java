package verbe;

import java.util.ArrayList;

public class ListeVerbe {
    public ArrayList<Verbe> list_verb = null;

    public ListeVerbe(int taille) {
        this.list_verb = new ArrayList<Verbe>(taille);
    }

    public String conjugue1erPersonneSingulier(){
        String res = "";
        for(Verbe v: list_verb)
        {
          res+= v.conjuguePremierPersonneSingulier();
        }
        return res;
    }
    public String conjugue1erPersonnePluriel()
    {
        String res = "";
        for(Verbe v: list_verb)
        {
            res+= v.conjuguePremierPersonnePluriels();
        }
        return res;
    }
    public String conjugueParticipePresent(){
        String res = "";
        for(Verbe v: list_verb)
        {
            res+= v.conjugueParticipePresent();
        }
        return res;
    }
    public String conjugueParticipePasse(){
        String res = "";
        for(Verbe v: list_verb)
        {
            res+= v.conjugueParticipePasse();
        }
        return res;
    }
}
