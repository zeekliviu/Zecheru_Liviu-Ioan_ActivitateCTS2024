package a.ex5.main;

import a.ex5.farmacie.MedicamentFarmacie;
import a.ex5.magazin.Medicament;
import a.ex5.magazin.MedicamentAdapter;
import a.ex5.magazin.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        Medicament medicamentSpital = new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie = new MedicamentAdapter(medicamentSpital);

        medicamentFarmacie.cumparaMedicament();
    }
}
