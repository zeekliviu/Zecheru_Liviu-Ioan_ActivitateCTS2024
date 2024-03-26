package b.ex3.clase;

public abstract class SupaAbstracta {
    private String denumire;
    private float pret;

    public SupaAbstracta(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String denumire() {
        return denumire;
    }

    public float pret() {
        return pret;
    }

    public abstract void afisareDetalii();
}
