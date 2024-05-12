package f.ex6.clase;

public class Mici implements Compozabil{
    private String producator;
    private String model;
    private int nrLocuri;

    public Mici(String model, int nrLocuri, String producator) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.producator = producator;
    }

    @Override
    public void adauga(Compozabil compozabil) {
        throw new UnsupportedOperationException("Nu există altă categorie!");
    }

    @Override
    public void sterge(Compozabil compozabil) {
        throw new UnsupportedOperationException("Nu există altă categorie!");
    }

    @Override
    public Compozabil getCompozabil(int index) {
        throw new UnsupportedOperationException("Nu există altă categorie!");
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sAutobuzul %s produs de %s cu %d locuri%n", indent, this.model, this.producator, this.nrLocuri);
    }
}
