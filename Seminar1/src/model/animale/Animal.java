package model.animale;

public abstract class Animal implements Vietate {
    private int varsta, nrPicioare;
    private String name;

    public Animal(int varsta, int nrPicioare, String name) {
        this.varsta = varsta;
        this.nrPicioare = nrPicioare;
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

