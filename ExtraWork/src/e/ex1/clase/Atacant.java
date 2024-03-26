package e.ex1.clase;

public class Atacant extends Jucator{

    Atacant(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Atacantul " + nume + " are numarul " + nrTricou + " pe tricou.");
    }
}
