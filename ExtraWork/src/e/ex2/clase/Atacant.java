package e.ex2.clase;

public class Atacant extends Jucator{
    Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public void detalii() {
        System.out.printf("Atacantul %s are numarul %d pe tricou%n", nume, nrTricou);
    }
}
