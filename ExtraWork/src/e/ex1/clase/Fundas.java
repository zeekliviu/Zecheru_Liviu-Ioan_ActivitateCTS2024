package e.ex1.clase;

public class Fundas extends Jucator{
    Fundas(String nume, int nrTricou) {
        super(nume, nrTricou);
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Fundasul "+nume+" are numarul "+nrTricou+" pe tricou.");
    }
}
