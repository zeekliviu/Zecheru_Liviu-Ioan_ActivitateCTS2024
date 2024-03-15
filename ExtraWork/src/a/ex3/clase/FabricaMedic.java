package a.ex3.clase;

public class FabricaMedic extends FabricaPersonal{
    @Override
    public Personal getPersonal(String nume, int varsta) {
        return new Medic(nume, varsta);
    }
}
