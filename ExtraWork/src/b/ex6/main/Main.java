package b.ex6.main;

import b.ex6.clase.Client;
import b.ex6.clase.Restaurant;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clienti = List.of(
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10)),
                new Client(RandomStringUtils.randomAlphabetic(10))
        );
        Restaurant restaurant = new Restaurant(clienti.size());
        clienti.forEach(restaurant::rezervaMasa);
    }
}
