package e.ex2.clase;

public class Portar extends Jucator{
    Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public void detalii() {
        System.out.printf("Portarul %s are numarul %d pe tricou%n", nume, nrTricou);
    }
}
