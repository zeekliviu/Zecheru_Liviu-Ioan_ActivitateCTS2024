package b.ex6.clase;

public class Masa {
    private boolean isLibera;
    private boolean isDebarasata;
    private boolean hasServetele;

    public Masa(boolean hasServetele, boolean isDebarasata, boolean isLibera) {
        this.hasServetele = hasServetele;
        this.isDebarasata = isDebarasata;
        this.isLibera = isLibera;
    }

    public boolean eOk()
    {
        return this.isLibera && this.isDebarasata && this.hasServetele;
    }

    public void ocupa()
    {
        this.isLibera = this.isDebarasata = this.hasServetele = false;
    }
}
