package d.ex2.main;

import d.ex2.clase.Client;
import d.ex2.clase.FabricaClienti;
import d.ex2.clase.FabricaPersoaneFizice;
import d.ex2.clase.FabricaPersoaneJuridice;

public class Main {
    public static void main(String[] args) {
        FabricaClienti fabricaPF = new FabricaPersoaneFizice();
        FabricaClienti fabricaPJ = new FabricaPersoaneJuridice();
        Client pf1 = fabricaPF.getClient("Popescu Ion", 10000);
        Client pj1 = fabricaPJ.getClient("SC ACS SRL", 30000);
        pf1.afiseazaDate();
        pj1.afiseazaDate();
    }
}
