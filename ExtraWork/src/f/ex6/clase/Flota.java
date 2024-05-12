package f.ex6.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Compozabil{
    private String denumire;
    private List<Compozabil> autobuzeMari;

    public Flota(String denumire) {
        this.denumire = denumire;
        this.autobuzeMari = new ArrayList<>();
    }

    @Override
    public void adauga(Compozabil compozabil) {
        this.autobuzeMari.add(compozabil);
    }

    @Override
    public void sterge(Compozabil compozabil) {
        this.autobuzeMari.remove(compozabil);
    }

    @Override
    public Compozabil getCompozabil(int index) {
        return this.autobuzeMari.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("Flota %s are următoarele autobuze:%n", this.denumire);
        this.autobuzeMari.forEach(autobuz -> autobuz.afiseaza("\t"));
    }
}
