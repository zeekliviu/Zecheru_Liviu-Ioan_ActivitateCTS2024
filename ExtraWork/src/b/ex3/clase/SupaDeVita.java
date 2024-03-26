package b.ex3.clase;

public class SupaDeVita extends SupaAbstracta{
    SupaDeVita(String denumire, float pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Supa de vita: " + super.denumire() + ", pret: " + super.pret());
    }
}
