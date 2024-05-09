package c.ex8.main;

import c.ex8.clase.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_MAGAZIE = 15;
    static int NR_MAX_CHAR_SECTIUNE = 10;
    static int NR_MAX_CHAR_SUBSECTIUNE = 5;
    static int NR_MAX_CHAR_MEDICAMENT = 50;
    static int NR_MAX_SECTIUNI = 5;
    static int NR_MAX_SUBSECTIUNI = 7;
    static int NR_MAX_MEDICAMENTE = 10;
    static Random rng = new Random();

    static Compozibil getCompozit(Class<?> tip, String denumire)
    {
        switch (tip.getSimpleName())
        {
            case "Magazie":
                return new Magazie(denumire);
            case "Sectiune":
                return new Sectiune(denumire);
            case "Subsectiune":
                return new Subsectiune(denumire);
            case "Medicament":
                return new Medicament(denumire);
            default:
                throw new RuntimeException("Nu există această categorie de Compozit!");
        }
    }

    static Compozibil getIerarhie()
    {
        Compozibil magazie = getCompozit(Magazie.class, RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_MAGAZIE)+1));
        for (int i = 0; i <= rng.nextInt(NR_MAX_SECTIUNI); i++) {
            Compozibil sectiune = getCompozit(Sectiune.class, RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_SECTIUNE))+1);
            for (int i1 = 0; i1 <= rng.nextInt(NR_MAX_SUBSECTIUNI); i1++) {
                Compozibil subsectiune = getCompozit(Subsectiune.class, RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_SUBSECTIUNE)+1));
                for (int i2 = 0; i2 <= rng.nextInt(NR_MAX_MEDICAMENTE); i2++) {
                    Compozibil medicament = getCompozit(Medicament.class, RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_MEDICAMENT)+1));
                    subsectiune.adauga(medicament);
                }
                sectiune.adauga(subsectiune);
            }
            magazie.adauga(sectiune);
        }
        return magazie;
    }

    public static void main(String[] args) {
        Compozibil magazie = getIerarhie();
        magazie.afiseaza(null);
    }
}
