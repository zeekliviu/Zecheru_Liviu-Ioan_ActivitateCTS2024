package f.ex6.clase;

import java.util.ArrayList;
import java.util.List;

public class Medii implements Compozabil{
    private String producator;
    private String model;
    private int nrLocuri;
    private List<Compozabil> mici;

    public Medii(String model, int nrLocuri, String producator) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.producator = producator;
        this.mici = new ArrayList<>();
    }


    @Override
    public void adauga(Compozabil compozabil) {
        this.mici.add(compozabil);
    }

    @Override
    public void sterge(Compozabil compozabil) {
        this.mici.remove(compozabil);
    }

    @Override
    public Compozabil getCompozabil(int index) {
        return this.mici.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sAutobuzul %s produs de %s cu %d locuri%n", indent, this.model, this.producator, this.nrLocuri);
        this.mici.forEach(autobuz->autobuz.afiseaza("\t\t\t"));
    }
}
