package a.ex15.clase;

public class PacientTratabil implements Internabil{
    private String nume;
    private byte varsta;

    public PacientTratabil(String nume, byte varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    @Override
    public void interneaza() {
        System.out.printf("Pacientul tratabil %s, în vârstă de %d va fi internat.%n", this.nume, this.varsta);
    }

    @Override
    public void trateaza() {
        System.out.printf("Pacientul tratabil %s, în vârstă de %d va fi tratat.%n", this.nume, this.varsta);
    }
}
