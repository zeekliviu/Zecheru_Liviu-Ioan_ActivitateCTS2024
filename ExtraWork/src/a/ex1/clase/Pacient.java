package a.ex1.clase;

public class Pacient {
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean areHalat;
    private boolean arePapuci;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", areHalat=").append(areHalat);
        sb.append(", arePapuci=").append(arePapuci);
        sb.append('}');
        return sb.toString();
    }

    public Pacient() {
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.areHalat = false;
        this.arePapuci = false;
    }

    public boolean arePatRabatabil() {
        return arePatRabatabil;
    }

    void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    void setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
    }

    public boolean areMicDejunInclus() {
        return areMicDejunInclus;
    }

    public boolean areHalat() {
        return areHalat;
    }

    public boolean arePapuci() {
        return arePapuci;
    }
}
