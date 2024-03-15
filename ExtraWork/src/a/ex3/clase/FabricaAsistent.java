package a.ex3.clase;

public class FabricaAsistent extends FabricaPersonal{
    @Override
    public Personal getPersonal(String nume, int varsta) {
        return new Asistent(nume, varsta);
    }
}
