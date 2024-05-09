package c.ex5.clase.vechi;

import c.ex5.clase.nou.Gestiune;

public class AdapterStoc extends Gestiune {
    private Stocabil medicament;
    private int cantitate;

    public AdapterStoc(Stocabil medicament, int cantitate)
    {
        this.medicament = medicament;
        this.cantitate = cantitate;
    }

    public boolean verificaStoc()
    {
        return super.verificaStocPentruMedicament(((Stoc)medicament).getIdMedicament(), cantitate);
    }
}
