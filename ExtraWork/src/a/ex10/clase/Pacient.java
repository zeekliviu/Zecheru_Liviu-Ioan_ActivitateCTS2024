package a.ex10.clase;

public class Pacient implements Flyweight{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    @Override
    public void afiseazaInformatii(Internare internare) {
        StringBuffer sb = new StringBuffer(toString());
        sb.append(internare.toString());
        System.out.println(sb);
    }
}
