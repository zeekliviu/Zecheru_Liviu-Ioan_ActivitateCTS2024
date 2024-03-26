package b.ex1.clase;

public class SupaDeLegume extends SupaAbstracta{
    SupaDeLegume(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        final StringBuffer sb = new StringBuffer("Supa de legume ");
        sb.append(super.denumire()).append(" are pretul de ").append(super.pret()).append(" RON.");
        return sb.toString();
    }
}
