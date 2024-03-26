package d.ex2.clase;

public class FabricaPersoaneFizice implements FabricaClienti{

    @Override
    public Client getClient(String denumire, float depozit) {
        return new PersoanaFizica(denumire, depozit);
    }
}
