package e.ex2.clase;

public class FabricaAtacant implements FabricaJucatori{
    @Override
    public Jucator getJucator(String nume, int nrTricou) {
        return new Atacant(nume, nrTricou);
    }
}
