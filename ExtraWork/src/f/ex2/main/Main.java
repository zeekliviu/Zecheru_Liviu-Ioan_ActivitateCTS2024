package f.ex2.main;

import f.ex2.clase.Autobuz;
import f.ex2.clase.Transport;

public class Main {
    public static void main(String[] args) {
        Transport soferitza = new Autobuz("Eliza", 102);
        Transport soferoi = soferitza.cloneaza();
        soferoi.setNrLinie(116);
        soferoi.setNumeSofer("Liviu");
        soferitza.detalii();
        soferoi.detalii();
    }
}
