package d.ex2.clase;

public class PersoanaFizica extends Client{

    PersoanaFizica(String nume, float depozit) {
        super(nume, depozit);
    }

    @Override
    public void afiseazaDate() {
        System.out.println("Persoana fizica " + super.getNume() + " are un depozit de " + super.getDepozit() + " RON.");
    }
}
