package a.ex8.clase;

public class SectieSpital implements Departament{
    private String nume;

    public SectieSpital(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(Departament departament) {
        throw new UnsupportedOperationException("Secțiile nu au moștenitori!");
    }

    @Override
    public void sterge(Departament departament) {
        throw new UnsupportedOperationException("Secțiile nu au moștenitori!");
    }

    @Override
    public Departament getDepartament(int index) {
        throw new UnsupportedOperationException("Secțiile nu au moștenitori!");
    }

    @Override
    public void afisare(String indentare) {
        System.out.printf(indentare+"Secția %s%n", this.nume);
    }
}
