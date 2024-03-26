package b.ex3.clase;

public class SupaDeLegume extends SupaAbstracta{
    SupaDeLegume(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de legume: " + super.denumire() + ", pret: " + super.pret());
    }
}
