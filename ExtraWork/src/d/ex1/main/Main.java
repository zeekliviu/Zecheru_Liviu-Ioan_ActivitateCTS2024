package d.ex1.main;

import d.ex1.clase.FabricaPacheteBancare;
import d.ex1.clase.PachetBancar;
import d.ex1.clase.TipPachetBancar;

public class Main {
    public static void main(String[] args) {
        PachetBancar nevoiPersonale = FabricaPacheteBancare.getPachetBancar(TipPachetBancar.NEVOI_PERSONALE, "Creditul cu dobanda fixa pentru nevoie personale", 5.25f);
        PachetBancar ipotecar = FabricaPacheteBancare.getPachetBancar(TipPachetBancar.CREDIT_IPOTECAR, "Creditul bu dobanda fixa pentru ipoteci", 10.4f);
        nevoiPersonale.afiseazaDetalii();
        ipotecar.afiseazaDetalii();
    }
}
