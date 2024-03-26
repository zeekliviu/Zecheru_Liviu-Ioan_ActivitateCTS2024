package e.ex1.clase;

public abstract class Jucator {
    protected String nume;
    protected int nrTricou;
    Jucator(String nume, int nrTricou)
    {
        this.nume = nume;
        this.nrTricou = nrTricou;
    }
    public abstract void afiseazaJucator();
}
