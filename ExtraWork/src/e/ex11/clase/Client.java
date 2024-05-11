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

    public void setModProcesare(Class<?> verificabil) {
        if(!Verificabil.class.isAssignableFrom(verificabil))
        {
            throw new IllegalArgumentException("Clasa trebuie să implementeze Verificabil!");
        }
        switch(verificabil.getSimpleName())
        {
            case "TribunaVIP":
                this.modProcesare = tribunaVIP;
                break;
            case "Tribuna":
                this.modProcesare = tribuna;
                break;
            case "Peluza":
                this.modProcesare = peluza;
                break;
        }
    }

    public void proceseaza()
    {
        this.modProcesare.verifica();
    }
}
