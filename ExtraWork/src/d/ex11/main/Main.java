package d.ex11.main;

import d.ex11.clase.Client;
import d.ex11.clase.PersoanaJuridica;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_PERSOANA = 20;
    static Random rng = new Random();
    public static void main(String[] args) {
        Client client = new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_PERSOANA)));
        client.solicita();
        client.setSolicitabil(PersoanaJuridica.class);
        client.solicita();
    }
}
