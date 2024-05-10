package d.ex11.clase;

public class Client {
    private String nume;
    private Solicitabil solicitabil;
    private static PersoanaFizica pf = new PersoanaFizica();
    private static PersoanaJuridica pj = new PersoanaJuridica();

    public Client(String nume) {
        this.nume = nume;
        this.solicitabil = pf;
    }

    public void setSolicitabil(Class<?> tip) {
        switch(tip.getSimpleName())
        {
            case "PersoanaFizica":
                this.solicitabil = pf;
                break;
            case "PersoanaJuridica":
                this.solicitabil = pj;
                break;
            default:
                throw new RuntimeException("Tipul persoanei poate fi doar PF sau PJ!");
        }
    }

    public void solicita()
    {
        this.solicitabil.solicita();
    }
}
