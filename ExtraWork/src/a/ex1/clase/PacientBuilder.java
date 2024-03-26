package a.ex1.clase;

public class PacientBuilder implements AbstractBuilder{
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean areHalat;
    private boolean arePapuci;

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }

    @Override
    public Pacient build() {
        var pacient = new Pacient();
        pacient.setArePatRabatabil(arePatRabatabil);
        pacient.setAreMicDejunInclus(areMicDejunInclus);
        pacient.setAreHalat(areHalat);
        pacient.setArePapuci(arePapuci);
        return pacient;
    }
}
