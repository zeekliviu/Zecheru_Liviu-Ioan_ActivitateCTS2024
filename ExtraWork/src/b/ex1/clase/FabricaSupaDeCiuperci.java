package b.ex1.clase;

public class FabricaSupaDeCiuperci implements FabricaSupe{
    @Override
    public SupaAbstracta creareSupa(String denumire, float pret) {
        return new SupaDeCiuperci(denumire, pret);
    }
}
