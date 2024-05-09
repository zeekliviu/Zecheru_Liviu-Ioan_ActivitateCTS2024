package c.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Compozibil{
    private List<Compozibil> subsectiuni;
    private String denumire;

    public Sectiune(String denumire)
    {
        this.denumire = denumire;
        this.subsectiuni = new ArrayList<>();
    }
    @Override
    public void adauga(Compozibil c) {
        this.subsectiuni.add(c);
    }

    @Override
    public void sterge(Compozibil c) {
        this.subsectiuni.remove(c);
    }

    @Override
    public Compozibil get(int index) {
        return this.subsectiuni.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sSecțiunea %s are următoarele subsecțiuni:%n", indent, this.denumire);
        this.subsectiuni.forEach(subsectiune -> subsectiune.afiseaza("\t\t"));
    }
}
