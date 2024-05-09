package c.ex15.main;

import c.ex15.clase.Asistent;
import c.ex15.clase.Comanda;
import c.ex15.clase.ComandaMedicament;
import c.ex15.clase.Farmacist;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_MED = 20;
    static Random rng = new Random();

    static Comanda getComanda(Asistent asistent)
    {
        return new ComandaMedicament(asistent, RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_MED)+1));
    }
    public static void main(String[] args) {
        Asistent asistent = new Asistent();
        Farmacist farmacist = new Farmacist();

        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));

        farmacist.executaComenzi();

        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));
        farmacist.adaugaComanda(getComanda(asistent));

        farmacist.executaComenzi();
    }
}
