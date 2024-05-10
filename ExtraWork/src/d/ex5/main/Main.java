package d.ex5.main;

import d.ex5.clase.client.Client;
import d.ex5.clase.vechi.AdapterCreditFinanciar;
import d.ex5.clase.vechi.CreditFinanciar;
import d.ex5.clase.vechi.Creditabil;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_CLIENT = 10;
    static Random rng = new Random();
    public static void main(String[] args) {
        Client client = new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_CLIENT)+1), rng.nextBoolean());

        Creditabil creditFinanciar = new CreditFinanciar(client);

        creditFinanciar.acordaCredit();

        AdapterCreditFinanciar adapterCreditFinanciar = new AdapterCreditFinanciar(creditFinanciar);

        adapterCreditFinanciar.acordaCredit();
    }
}
