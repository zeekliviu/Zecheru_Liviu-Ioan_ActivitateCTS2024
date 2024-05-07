package b.ex11.clase;

public class Factura {
    private String numeClient;
    private Platibil modPlata;

    public Factura(String numeClient)
    {
        this.numeClient = numeClient;
        this.modPlata = new Cash();
    }

    public void setModPlata(Platibil modPlata)
    {
        this.modPlata = modPlata;
    }

    public void plateste(float valoare)
    {
        System.out.printf("Clientul %s a plătit %.2f RON cu %s", this.numeClient, valoare, this.modPlata.plateste());
    }
}
