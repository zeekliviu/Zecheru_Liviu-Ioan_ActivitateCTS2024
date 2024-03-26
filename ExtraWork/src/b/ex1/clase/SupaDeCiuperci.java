package b.ex1.clase;

public class SupaDeCiuperci extends SupaAbstracta{
    SupaDeCiuperci(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        final StringBuffer sb = new StringBuffer("Supa de ciuperci ");
        sb.append(super.denumire()).append(" are pretul de ").append(super.pret()).append(" RON.");
        return sb.toString();
    }
}
