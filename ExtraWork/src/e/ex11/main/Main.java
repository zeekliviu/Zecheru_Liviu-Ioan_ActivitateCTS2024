package e.ex11.main;

import e.ex11.clase.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;
import java.util.Random;

public class Main {
    static final int MAX_CHAR_NUME = 10;
    static final int MAX_MICROBISTI = 100;
    static final Random rng = new Random();
    static final List<Class<? extends Verificabil>> clase = List.of(
            Peluza.class,
            Tribuna.class,
            TribunaVIP.class
    );
    public static void main(String[] args) {
        for (int i = 0; i < rng.nextInt(MAX_MICROBISTI); i++) {
            Client c = new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(MAX_CHAR_NUME)+1));
            c.setModProcesare(clase.get(rng.nextInt(clase.size())));
            c.proceseaza();
        }
    }
}
