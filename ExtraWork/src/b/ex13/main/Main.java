package b.ex13.main;

import b.ex13.clase.Rezervare;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_NUME = 10;
    static int NR_MAX_PERSOANE = 5;
    static Random rng = new Random();

    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(rng.nextInt(NR_MAX_PERSOANE), RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)));

        rezervare.setStareLibera();
        rezervare.setStareOcupata();
        rezervare.setStareLibera();
        rezervare.setStareOcupata();
        rezervare.setStareRezervata();
    }
}
