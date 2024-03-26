package b.ex3.clase;

public class SupaDeCiuperci extends SupaAbstracta{
    SupaDeCiuperci(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de ciuperci: " + super.denumire() + ", pret: " + super.pret());
    }
}
