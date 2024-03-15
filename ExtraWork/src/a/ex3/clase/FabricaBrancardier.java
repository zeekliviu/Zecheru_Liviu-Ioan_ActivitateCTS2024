package a.ex3.clase;

public class FabricaBrancardier extends FabricaPersonal{
    @Override
    public Personal getPersonal(String nume, int varsta) {
        return new Brancardier(nume, varsta);
    }
}
