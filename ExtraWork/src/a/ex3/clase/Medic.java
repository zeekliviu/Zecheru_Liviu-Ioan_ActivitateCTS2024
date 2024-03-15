package a.ex3.clase;

public class Medic extends Personal{
    protected Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void prezentare() {
        System.out.println("Medicul " + super.getNume() + " are varsta de " + super.getVarsta() + " ani.");
    }
}
