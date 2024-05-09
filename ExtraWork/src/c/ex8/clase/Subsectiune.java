package c.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Compozibil{
    private List<Compozibil> medicamente;
    private String denumire;

    public Subsectiune(String denumire)
    {
        this.denumire = denumire;
        this.medicamente = new ArrayList<>();
    }
    @Override
    public void adauga(Compozibil c) {
        this.medicamente.add(c);
    }

    @Override
    public void sterge(Compozibil c) {
        this.medicamente.remove(c);
    }

    @Override
    public Compozibil get(int index) {
        return this.medicamente.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sSubsecțiunea %s are următoarele medicamente:%n", indent, this.denumire);
        this.medicamente.forEach(medicament -> medicament.afiseaza("\t\t\t"));
    }
}
