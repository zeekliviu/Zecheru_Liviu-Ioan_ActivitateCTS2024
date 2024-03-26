package e.ex2.clase;

public class Fundas extends Jucator{
    Fundas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public void detalii() {
        System.out.printf("Jucatorul %s are numarul %d pe tricou%n", nume, nrTricou);
    }
}
