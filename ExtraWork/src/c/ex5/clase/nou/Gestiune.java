package c.ex5.clase.nou;

import c.ex5.depozit.Depozit;

public class Gestiune extends Depozit implements Gestionabil{
    public Gestiune()
    {
        super();
    }
    @Override
    public boolean verificaStocPentruMedicament(int id, int cantitate) {
        return super.depozit.get(id) >= cantitate;
    }
}
