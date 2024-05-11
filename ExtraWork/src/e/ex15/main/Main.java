package e.ex15.main;

import e.ex15.clase.Manager;
import e.ex15.clase.Meci;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Meci meci = new Meci();
        Manager manager = new Manager();

        meci.seteazaDetalii(new Date(), "Chiajna", "Mioveni", 10000);
        manager.adaugaStare(meci.creeazaMemento());

        meci.seteazaDetalii(new Date(), "Petrolul", "FCSB", 30000);
        manager.adaugaStare(meci.creeazaMemento());

        System.out.println(manager.getStare(0));
    }
}
