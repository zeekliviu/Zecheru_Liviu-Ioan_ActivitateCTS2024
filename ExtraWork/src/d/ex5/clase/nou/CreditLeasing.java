package d.ex5.clase.nou;

public class CreditLeasing {
    private String nume;

    public CreditLeasing(String nume) {
        this.nume = nume;
    }

    protected void acordaCredit(String nume)
    {
        System.out.printf("Clientul %s poate primi un credit in leasing.%n", this.nume);
    }

    public String getNume() {
        return nume;
    }
}
