package e.ex5.main;

import e.ex5.clase.firma.Firma;
import e.ex5.clase.online.AdapterOnline;
import e.ex5.clase.online.Online;
import e.ex5.clase.online.Rezervabil;

public class Main {
    public static void main(String[] args) {
        Firma agentie = new Firma();
        agentie.cumparaBilet("FCSB - Dinamo", 3, "Gina");
        agentie.cumparaBilet("FCSB - Dinamo", 4, "Miruna");
        agentie.cumparaBilet("FCSB - Dinamo", 1, "Gigi");
        agentie.cumparaBilet("FCSB - Dinamo", 2, "Carmen");
        agentie.cumparaBilet("FCSB - Dinamo", 5, "Isolda");
        agentie.cumparaBilet("FCSB - Dinamo", 1, "Florin");

        Rezervabil biletOnline = new Online(3, "FCSB - Dinamo", "Andrei");
        AdapterOnline adapter = new AdapterOnline(biletOnline);

        adapter.cumparaBilet();
    }
}
