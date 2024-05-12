package f.ex6.clase;

import java.util.ArrayList;
import java.util.List;

public class Mari implements Compozabil{
    private String producator;
    private String model;
    private int nrLocuri;
    private List<Compozabil> medii;

    public Mari(String model, int nrLocuri, String producator) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.producator = producator;
        this.medii = new ArrayList<>();
    }


    @Override
    public void adauga(Compozabil compozabil) {
        this.medii.add(compozabil);
    }

    @Override
    public void sterge(Compozabil compozabil) {
        this.medii.remove(compozabil);
    }

    @Override
    public Compozabil getCompozabil(int index) {
        return this.medii.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sAutobuzul %s produs de %s cu %d locuri%n", indent, this.model, this.producator, this.nrLocuri);
        this.medii.forEach(autobuz->autobuz.afiseaza("\t\t"));
    }
}
