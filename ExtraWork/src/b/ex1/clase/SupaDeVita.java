package b.ex1.clase;

public class SupaDeVita extends SupaAbstracta{
    SupaDeVita(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public String afisareDetalii() {
        final StringBuffer sb = new StringBuffer("Supa de vita ");
        sb.append(super.denumire()).append(" are pretul de ").append(super.pret()).append(" RON.");
        return sb.toString();
    }
}
