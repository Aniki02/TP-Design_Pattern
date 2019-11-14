package verbe;

public class DeuxiemeGroupe extends Verbe {
    public DeuxiemeGroupe(String radical) {
        super(radical, "ir");
    }

    @Override
    protected String terminaison1erPP() { return "is"; }

    @Override
    protected String terminaison1erPPl() { return "issons"; }

    @Override
    protected String terminaisonPPss() { return "i"; }

}
