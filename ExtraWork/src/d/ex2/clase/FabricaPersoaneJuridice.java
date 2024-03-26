package d.ex2.clase;

public class FabricaPersoaneJuridice implements FabricaClienti{
    @Override
    public Client getClient(String denumire, float depozit) {
        return new PersoanaJuridica(denumire, depozit);
    }
}
