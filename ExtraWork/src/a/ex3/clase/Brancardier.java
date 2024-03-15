package a.ex3.clase;

public class Brancardier extends Personal{
    protected Brancardier(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void prezentare() {
        System.out.println("Brancardierul " + super.getNume() + " are varsta de " + super.getVarsta() + " ani.");
    }
}
