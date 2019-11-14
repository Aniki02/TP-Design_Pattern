package verbes.src;

public abstract class Verbe {
    private String radical;
    public Verbe(String infinitif, String terminaison) throws IllegalArgumentException {
        if (!infinitif.endsWith(terminaison))
            throw new IllegalArgumentException("La terminaison n'est pas valide");
        this.radical = infinitif;
    }

    public String getRadical() {
        return radical;
    }
    public void setRadical(String radical) {
        this.radical = radical;
    }
}
