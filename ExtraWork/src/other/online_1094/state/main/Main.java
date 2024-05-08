package other.online_1094.state.main;

import org.apache.commons.lang3.RandomStringUtils;
import other.online_1094.state.clase.Pacient;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_NUME = 20;
    static Random rng = new Random();

    public static void main(String[] args) {
        Pacient pacient = new Pacient(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)));

        pacient.imbunatatireStare();
        pacient.vindecare();
    }
}
