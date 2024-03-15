package a.ex3.clase;

public class Asistent extends Personal{
    protected Asistent(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void prezentare() {
        System.out.println("Asistentul " + super.getNume() + " are varsta de " + super.getVarsta() + " ani.");
    }
}
