package b.ex1.clase;

public class FabricaSupaDeLegume implements FabricaSupe{
    @Override
    public SupaAbstracta creareSupa(String denumire, float pret) {
        return new SupaDeLegume(denumire, pret);
    }
}
