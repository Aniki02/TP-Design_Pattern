package verbe;

public class PremierGroupe extends Verbe{

    public PremierGroupe(String infinitif) {
        super(infinitif, "er");

    }
    @Override
    protected String terminaison1erPP() { return "e"; }

    @Override
    protected String terminaison1erPPl() { return "ons"; }

    @Override
    protected String terminaisonPPss() { return "é"; }
}
