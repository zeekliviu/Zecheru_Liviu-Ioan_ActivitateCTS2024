package c.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class Magazie implements Compozibil{
    private List<Compozibil> sectiuni;
    private String denumire;

    public Magazie(String denumire) {
        this.denumire = denumire;
        this.sectiuni = new ArrayList<>();
    }

    @Override
    public void adauga(Compozibil c) {
        this.sectiuni.add(c);
    }

    @Override
    public void sterge(Compozibil c) {
        this.sectiuni.remove(c);
    }

    @Override
    public Compozibil get(int index) {
        return this.sectiuni.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("Secțiunile de medicamente din cadrul magaziei %s sunt:%n", this.denumire);
        this.sectiuni.forEach(sectiune -> sectiune.afiseaza("\t"));
    }
}
