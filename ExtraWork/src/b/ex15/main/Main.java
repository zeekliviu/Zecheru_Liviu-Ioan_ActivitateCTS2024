package b.ex15.main;

import b.ex15.clase.*;

public class Main {
    public static void main(String[] args) {
        Chelner chelner = new Chelner();
        Ocupabil masaRezervabila = new MasaRezervabila();

        Rezervabil rezervare = new ComandaRezervare(masaRezervabila);
        Rezervabil ocupare = new ComandaOcupare(masaRezervabila);

        chelner.invoca(rezervare);
        chelner.invoca(ocupare);
    }
}
