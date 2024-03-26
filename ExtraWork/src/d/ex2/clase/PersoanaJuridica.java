package d.ex2.clase;

public class PersoanaJuridica extends Client{
    PersoanaJuridica(String nume, float depozit) {
        super(nume, depozit);
    }

    @Override
    public void afiseazaDate() {
        System.out.println("Persoana juridica " + super.getNume() + " are un depozit de " + super.getDepozit() + " RON.");
    }
}
