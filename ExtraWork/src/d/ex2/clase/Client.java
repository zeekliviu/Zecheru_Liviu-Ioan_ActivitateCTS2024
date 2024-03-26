package d.ex2.clase;

public abstract class Client {
    private String nume;
    private float depozit;
    public Client(String nume, float depozit)
    {
        this.nume = nume;
        this.depozit = depozit;
    }

    public String getNume() {
        return nume;
    }

    public float getDepozit() {
        return depozit;
    }

    public abstract void afiseazaDate();
}
