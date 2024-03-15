package a.ex2.clase;

public abstract class Personal {
    private String nume;
    private int varsta;

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    protected Personal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public abstract void prezentare();
}
