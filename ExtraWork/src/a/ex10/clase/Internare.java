package a.ex10.clase;

public class Internare {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;

    public Internare(int nrSalon, int nrPat, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Internare{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileSpitalizare=").append(nrZileSpitalizare);
        sb.append('}');
        return sb.toString();
    }
}
