package b.ex15.clase;

public class ComandaOcupare implements Rezervabil{
    private Ocupabil masa;
    public ComandaOcupare(Ocupabil masa)
    {
        this.masa = masa;
    }
    @Override
    public void schimba() {
        this.masa.ocupa();
    }
}
