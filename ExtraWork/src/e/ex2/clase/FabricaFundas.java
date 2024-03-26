package e.ex2.clase;

public class FabricaFundas implements FabricaJucatori{
    @Override
    public Jucator getJucator(String nume, int nrTricou) {
        return new Fundas(nume, nrTricou);
    }
}
