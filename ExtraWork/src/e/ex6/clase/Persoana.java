package e.ex6.clase;

public class Persoana {
    private Buletin buletin;
    private Bilet bilet;
    private boolean cazier;

    public Persoana(Bilet bilet, Buletin buletin, boolean cazier) {
        this.bilet = bilet;
        this.buletin = buletin;
        this.cazier = cazier;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public Buletin getBuletin() {
        return buletin;
    }

    public boolean isCazier() {
        return cazier;
    }
}
