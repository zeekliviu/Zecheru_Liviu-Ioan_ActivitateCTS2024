package b.ex3.clase;

public abstract class FabricaSupe {
    public static SupaAbstracta getSupa(TipSupa tip, String denumire, float pret) {
        switch (tip) {
            case CIUPERCI:
                return new SupaDeCiuperci(denumire, pret);
            case LEGUME:
                return new SupaDeLegume(denumire, pret);
            case VITA:
                return new SupaDeVita(denumire, pret);
            default:
                throw new IllegalArgumentException("Tipul de supa nu este corect!");
        }
    }
}
