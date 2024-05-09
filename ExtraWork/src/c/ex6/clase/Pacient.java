package c.ex6.clase;

public class Pacient {
    private String nume;
    private Reteta[] retete;
    private boolean cardSanatate;

    public Pacient(String nume, boolean cardSanatate, Reteta... retete)
    {
        this.nume = nume;
        this.cardSanatate = cardSanatate;
        this.retete = retete;
    }

    public boolean isCardSanatate() {
        return cardSanatate;
    }

    public String getNume() {
        return nume;
    }

    public Reteta[] getRetete() {
        return retete;
    }
}
