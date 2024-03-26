package b.ex1.main;

import b.ex1.clase.FabricaSupaDeCiuperci;
import b.ex1.clase.FabricaSupaDeLegume;
import b.ex1.clase.FabricaSupaDeVita;
import b.ex1.clase.FabricaSupe;

public class Main {
    public static void main(String[] args) {
        FabricaSupe fabricaSupeDeCiuperci = new FabricaSupaDeCiuperci();
        FabricaSupe fabricaSupeDeLegume = new FabricaSupaDeLegume();
        FabricaSupe fabricaSupeDeVita = new FabricaSupaDeVita();
        afisareInformatiiSupa(fabricaSupeDeCiuperci, "Ciupercara", 10);
        afisareInformatiiSupa(fabricaSupeDeLegume, "Moldovenească", 15);
        afisareInformatiiSupa(fabricaSupeDeVita, "Soup & Beef", 20);
    }
    public static void afisareInformatiiSupa(FabricaSupe fabricaSupe, String denumire, float pret) {
        System.out.println(fabricaSupe.creareSupa(denumire, pret).afisareDetalii());
    }
}
