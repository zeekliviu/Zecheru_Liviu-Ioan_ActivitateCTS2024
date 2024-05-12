package f.ex6.main;

import f.ex6.clase.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_MARI = 15;
    static int NR_MAX_MEDII = 30;
    static int NR_MAX_MICI = 45;
    static int MIN_NR_CHAR_DEN_PROD = 8;
    static int MAX_NR_CHAR_DEN_PROD = 15;
    static int MIN_NR_CHAR_DEN_MODEL = 5;
    static int MAX_NR_CHAR_DEN_MODEL = 13;
    static int NR_LOCURI_MARI = 50;
    static int NR_LOCURI_MEDII = 30;
    static int NR_LOCURI_MICI = 10;
    static Random rng = new Random();

    static Compozabil getIerarhie(String denumireFlota)
    {
        Compozabil flota = new Flota(denumireFlota);
        int nrAutobuzeMari = rng.nextInt(NR_MAX_MARI)+1;
        for (int i = 0; i < nrAutobuzeMari; i++) {
            Compozabil autobuzMare = new Mari(RandomStringUtils.randomAlphabetic(MIN_NR_CHAR_DEN_MODEL, MAX_NR_CHAR_DEN_MODEL), NR_LOCURI_MARI, RandomStringUtils.randomAlphabetic(MIN_NR_CHAR_DEN_PROD, MAX_NR_CHAR_DEN_PROD));
            int nrAutobuzeMedii = rng.nextInt(NR_MAX_MEDII)+1;
            for (int i1 = 0; i1 < nrAutobuzeMedii; i1++) {
                Compozabil autobuzMediu = new Medii(RandomStringUtils.randomAlphabetic(MIN_NR_CHAR_DEN_MODEL, MAX_NR_CHAR_DEN_MODEL), NR_LOCURI_MEDII, RandomStringUtils.randomAlphabetic(MIN_NR_CHAR_DEN_PROD, MAX_NR_CHAR_DEN_PROD));
                int nrAutobuzeMici = rng.nextInt(NR_MAX_MICI)+1;
                for (int i2 = 0; i2 < nrAutobuzeMici; i2++) {
                    Compozabil autobuzMic = new Mici(RandomStringUtils.randomAlphabetic(MIN_NR_CHAR_DEN_MODEL, MAX_NR_CHAR_DEN_MODEL), NR_LOCURI_MICI, RandomStringUtils.randomAlphabetic(MIN_NR_CHAR_DEN_PROD, MAX_NR_CHAR_DEN_PROD));
                    autobuzMediu.adauga(autobuzMic);
                }
                autobuzMare.adauga(autobuzMediu);
            }
            flota.adauga(autobuzMare);
        }
        return flota;
    }
    public static void main(String[] args) {
        Compozabil flota = getIerarhie("STB");
        flota.afiseaza(null);
    }
}
