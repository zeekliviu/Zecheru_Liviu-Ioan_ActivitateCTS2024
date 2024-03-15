package a.ex2.clase;

public class Asistent extends Personal {
    protected Asistent(String nume, int varsta) {
        super(nume, varsta);
    }
    @Override
    public void prezentare() {
        System.out.println("Asistentul " + super.getNume() + " are " + super.getVarsta() + " ani.");
    }
}
