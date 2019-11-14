package verbe;

public class TroisiemeGroupeEndre extends TroisiemeGroupe {
    public TroisiemeGroupeEndre(String radical) {
        super(radical, "endre");
    }

    @Override
    protected String terminaison1erPP() {
        return "ends";
    }

    @Override
    protected String terminaison1erPPl() {
        return "enons";
    }

    @Override
    protected String terminaisonPPss() {
        return "is";
    }
}
