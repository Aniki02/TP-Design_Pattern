package creeVerbe.src;

import verbes.src.Verbe;
import verbes.src.VerbeDeuxiemeGroupe;

public class CreeVerbe2emGroupe implements CreeVerbe {
    @Override
    public Verbe creeVerbe(String verbe) {
        return new VerbeDeuxiemeGroupe(verbe);
    }
}
