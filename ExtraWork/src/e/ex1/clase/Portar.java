package e.ex1.clase;

public class Portar extends Jucator{
    Portar(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Portarul " + nume + " are numarul "+ nrTricou +" pe tricou.");
    }
}
