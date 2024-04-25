package a.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class DepartamentSpital implements Departament{
    private List<Departament> listaSectii;
    private String nume;

    public DepartamentSpital(String nume) {
        this.nume = nume;
        this.listaSectii = new ArrayList<>();
    }

    @Override
    public void adauga(Departament departament) {
        this.listaSectii.add(departament);
    }

    @Override
    public void sterge(Departament departament) {
        this.listaSectii.remove(departament);
    }

    @Override
    public Departament getDepartament(int index) {
        return this.listaSectii.get(index);
    }

    @Override
    public void afisare(String indentare) {
        System.out.printf(indentare+"Departamentul %s are următoarele secții:%n", this.nume);
        listaSectii.forEach(departament -> departament.afisare("\t\t"));
    }
}
