package d.ex5.clase.client;

public class Client {
    private String nume;
    private boolean rauPlatnic;

    public Client(String nume, boolean rauPlatnic)
    {
        this.nume = nume;
        this.rauPlatnic = rauPlatnic;
    }

    public boolean isRauPlatnic() {
        return rauPlatnic;
    }

    public String getNume() {
        return nume;
    }
}
