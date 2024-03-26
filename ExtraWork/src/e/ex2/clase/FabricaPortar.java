package e.ex2.clase;

public class FabricaPortar implements FabricaJucatori{
    @Override
    public Jucator getJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
