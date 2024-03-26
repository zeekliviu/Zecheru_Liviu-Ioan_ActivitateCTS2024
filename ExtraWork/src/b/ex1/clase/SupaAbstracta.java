package b.ex1.clase;

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

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float pret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public abstract String afisareDetalii();
}
