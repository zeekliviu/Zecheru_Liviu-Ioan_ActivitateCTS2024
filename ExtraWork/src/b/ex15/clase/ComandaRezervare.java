package b.ex15.clase;

public class ComandaRezervare implements Rezervabil{
    private Ocupabil masa;
    public ComandaRezervare(Ocupabil masa)
    {
        this.masa = masa;
    }
    @Override
    public void schimba() {
        this.masa.rezerva();
    }
}
