package verbe;

import java.util.Vector;

public abstract class  Verbe {
    protected String radical;


    public Verbe(String infinitif, String terminaison) {
        if(!infinitif.endsWith(terminaison)) throw new IllegalArgumentException("Mauvaise terminaison!");
        this.radical = infinitif.substring(0, infinitif.length()-terminaison.length());
    }

    public String getRadical() {
        return radical;
    }

    public void setRadical(String radical)  {
        this.radical = radical;
    }

    protected String conjuguePremierPersonneSingulier() { return "Je "+radical+this.terminaison1erPP(); }// à la place de ? je veux avoir e ou is
    protected String conjuguePremierPersonnePluriels() { return "Nous "+radical+this.terminaison1erPPl(); }
    protected String conjugueParticipePresent() {
        String v = radical+this.terminaison1erPPl();
        return "En "+v.substring(0,v.length()-3)+"ant";
    }
    protected String conjugueParticipePasse() {
        return radical+this.terminaisonPPss();
    }

    protected abstract String terminaison1erPP();
    protected abstract String terminaison1erPPl();
    //protected abstract String terminaisonPP();
    protected abstract String terminaisonPPss();
}
