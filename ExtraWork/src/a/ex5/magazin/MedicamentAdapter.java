package a.ex5.magazin;

import a.ex5.farmacie.MedicamentFarmacie;

public class MedicamentAdapter extends MedicamentFarmacie {
    private Medicament medicamentSpital;
    public MedicamentAdapter(Medicament medicamentSpital)
    {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        super.cumparaMedicament();
    }
}
