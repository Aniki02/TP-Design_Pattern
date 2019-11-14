package creeVerbe.src;

import verbes.src.Verbe;
import verbes.src.VerbePremierGroupe;

public class CreeVerbe1erGroupe implements  CreeVerbe{

    @Override
    public Verbe creeVerbe(String verbe) {
        return new VerbePremierGroupe(verbe);
    }
}
