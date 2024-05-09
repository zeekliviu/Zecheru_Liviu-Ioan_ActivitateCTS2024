package c.ex8.clase;

public class Medicament implements Compozibil{
    private String denumire;

    public Medicament(String denumire)
    {
        this.denumire = denumire;
    }
    @Override
    public void adauga(Compozibil c) {
        throw new UnsupportedOperationException("Medicamentele nu au descendenți");
    }

    @Override
    public void sterge(Compozibil c) {
        throw new UnsupportedOperationException("Medicamentele nu au descendenți");
    }

    @Override
    public Compozibil get(int index) {
        throw new UnsupportedOperationException("Medicamentele nu au descendenți");
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sMedicamentul %s%n", indent, this.denumire);
    }
}
