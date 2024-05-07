package b.ex9.main;

import b.ex9.clase.Client;
import b.ex9.clase.Proxy;
import b.ex9.clase.Restaurant;
import b.ex9.clase.Rezervabil;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static int LUNGIME_NUME = 10;
    static int NR_MAXIM_CLIENTI = 10;
    static List<Client> getClients(Random randomGenerator)
    {
        List<Client> clienti = new ArrayList<>(NR_MAXIM_CLIENTI);
        for (int i = 0; i < NR_MAXIM_CLIENTI; i++)
        {
            clienti.add(new Client(RandomStringUtils.randomAlphabetic(LUNGIME_NUME), randomGenerator.nextInt(NR_MAXIM_CLIENTI) + 1));
        }
        return clienti;
    }
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Rezervabil restaurant = new Restaurant();
        List<Client> clienti = getClients(randomGenerator);
        System.out.println("----------------------fara proxy----------------------");
        clienti.forEach(restaurant::rezerva);
        System.out.println("----------------------folosind proxy----------------------");
        Rezervabil proxy = new Proxy(restaurant);
        clienti.forEach(proxy::rezerva);
    }
}
