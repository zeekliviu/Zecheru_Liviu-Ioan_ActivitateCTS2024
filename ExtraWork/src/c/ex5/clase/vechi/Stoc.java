package c.ex5.clase.vechi;

import c.ex5.depozit.Depozit;

public class Stoc extends Depozit implements Stocabil{
    private int idMedicament;

    public Stoc()
    {
        super();
    }
    @Override
    public void setareMedicament(int id) {
        this.idMedicament = id;
    }

    @Override
    public boolean verificareDisponibilitate(int cantitate) {
        return super.depozit.get(this.idMedicament) >= cantitate;
    }

    public int getIdMedicament() {
        return idMedicament;
    }
}
