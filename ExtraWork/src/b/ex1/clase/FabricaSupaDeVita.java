package b.ex1.clase;

public class FabricaSupaDeVita implements FabricaSupe{
    @Override
    public SupaAbstracta creareSupa(String denumire, float pret) {
        return new SupaDeVita(denumire, pret);
    }
}
