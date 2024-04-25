package a.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Departament{
    private List<Departament> listaDepartamente;
    private String nume;

    public Spital(String nume) {
        this.nume = nume;
        this.listaDepartamente = new ArrayList<>();
    }

    @Override
    public void adauga(Departament departament) {
        this.listaDepartamente.add(departament);
    }

    @Override
    public void sterge(Departament departament) {
        this.listaDepartamente.remove(departament);
    }

    @Override
    public Departament getDepartament(int index) {
        return this.listaDepartamente.get(index);
    }

    @Override
    public void afisare(String indentare) {
        System.out.printf("Spitalul %s are următoarele departamente:%n", this.nume);
        this.listaDepartamente.forEach(departament -> departament.afisare("\t"));
    }
}
