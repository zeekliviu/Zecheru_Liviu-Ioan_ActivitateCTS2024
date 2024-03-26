package b.ex3.main;

import b.ex3.clase.FabricaSupe;
import b.ex3.clase.SupaAbstracta;
import b.ex3.clase.TipSupa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SupaAbstracta> supeMasaTrei = new ArrayList<>();
        supeMasaTrei.add(FabricaSupe.getSupa(TipSupa.VITA, "Soup & Beef", 10));
        supeMasaTrei.add(FabricaSupe.getSupa(TipSupa.CIUPERCI, "Ciupercara", 8));
        supeMasaTrei.add(FabricaSupe.getSupa(TipSupa.LEGUME, "Legumicool", 7));
        supeMasaTrei.forEach(SupaAbstracta::afisareDetalii);
    }
}
