package c.ex5.main;

import c.ex5.clase.vechi.AdapterStoc;
import c.ex5.clase.vechi.Stoc;
import c.ex5.clase.vechi.Stocabil;

public class Main {
    public static void main(String[] args) {
        Stocabil stoc = new Stoc();
        stoc.setareMedicament(2);
        System.out.println(stoc.verificareDisponibilitate(1));

        AdapterStoc adapterStoc = new AdapterStoc(stoc, 1);
        System.out.println(adapterStoc.verificaStoc());
    }
}
