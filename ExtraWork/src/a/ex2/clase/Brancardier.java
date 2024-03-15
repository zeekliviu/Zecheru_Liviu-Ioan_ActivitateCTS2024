package a.ex2.clase;

public class Brancardier extends Personal {
    protected Brancardier(String nume, int varsta) {
        super(nume, varsta);
    }
    @Override
    public void prezentare() {
        System.out.println("Brancardierul " + super.getNume() + " are " + super.getVarsta() + " ani.");
    }
}
