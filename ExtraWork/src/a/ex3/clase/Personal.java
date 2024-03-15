package a.ex3.clase;

public abstract class Personal {
    private String nume;
    private int varsta;

    public Personal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    protected String getNume() {
        return nume;
    }

    protected int getVarsta() {
        return varsta;
    }

    public abstract void prezentare();
}
