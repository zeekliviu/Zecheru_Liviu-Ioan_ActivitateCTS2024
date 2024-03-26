package e.ex2.main;

import e.ex2.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FabricaJucatori fabricaAtacanti = new FabricaAtacant();
        FabricaJucatori fabricaPortari = new FabricaPortar();
        FabricaJucatori fabricaFundasi = new FabricaFundas();
        List<Jucator> echipa = new ArrayList<>(List.of(
                fabricaAtacanti.getJucator("Ronaldo", 7),
                fabricaPortari.getJucator("Tătărușanu", 1),
                fabricaFundasi.getJucator("Puyol", 19)));
        echipa.forEach(Jucator::detalii);
    }
}
