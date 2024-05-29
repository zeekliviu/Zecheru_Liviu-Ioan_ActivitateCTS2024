package e.ex11.clase;

public class Client {
    private String nume;
    private Verificabil modProcesare;

    private static final Verificabil tribunaVIP = new TribunaVIP();
    private static final Verificabil tribuna = new Tribuna();
    private static final Verificabil peluza = new Peluza();

    public Client(String nume) {
        this.nume = nume;
    }

    public void setModProcesare(Class<? extends Verificabil> verificabil) {
        if(verificabil.equals(TribunaVIP.class)) {
            this.modProcesare = tribunaVIP;
        } else if (verificabil.equals(Tribuna.class)) {
            this.modProcesare = tribuna;
        } else {
            this.modProcesare = peluza;
        }
    }

    public void proceseaza()
    {
        this.modProcesare.verifica();
    }
}
