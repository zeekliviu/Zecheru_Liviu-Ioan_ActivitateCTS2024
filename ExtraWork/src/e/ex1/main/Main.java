package e.ex1.main;

import e.ex1.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Portar portarPrincipal = (Portar) FabricaJucator.getJucator(TipJucator.PORTAR, "Tătărușanu", 1);
        Portar portarRezerva = (Portar) FabricaJucator.getJucator(TipJucator.PORTAR, "Buffon", 3);
        Atacant atacant = (Atacant) FabricaJucator.getJucator(TipJucator.ATACANT, "Messi", 16);
        Fundas fundas = (Fundas) FabricaJucator.getJucator(TipJucator.FUNDAS, "Puyol", 23);
        List<Jucator> echipa = new ArrayList<>(List.of(portarPrincipal, portarRezerva, atacant, fundas));
        echipa.forEach(Jucator::afiseazaJucator);
    }
}
