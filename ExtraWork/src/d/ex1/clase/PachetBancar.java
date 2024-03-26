package d.ex1.clase;

public abstract class PachetBancar {
    private String denumire;
    private float dobanda;

    public String getDenumire() {
        return denumire;
    }

    public float getDobanda() {
        return dobanda;
    }

    public PachetBancar(String denumire, float dobanda)
    {
        this.denumire = denumire;
        this.dobanda = dobanda;
    }
    public abstract void afiseazaDetalii();
}
