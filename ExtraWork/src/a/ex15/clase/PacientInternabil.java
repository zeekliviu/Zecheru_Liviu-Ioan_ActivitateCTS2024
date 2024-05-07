package a.ex15.clase;

public class PacientInternabil implements Internabil{
    private String nume;
    private byte varsta;

    public PacientInternabil(String nume, byte varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void interneaza() {
        System.out.printf("Pacientul internabil %s, în vârstă de %d ani va fi internat.%n", this.nume, this.varsta);
    }

    @Override
    public void trateaza() {
        System.out.printf("Pacientul internabil %s, în vârstă de %d ani va fi tratat.%n", this.nume, this.varsta);
    }
}
