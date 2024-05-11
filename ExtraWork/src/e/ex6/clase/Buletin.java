package e.ex6.clase;

import org.apache.commons.lang3.RandomStringUtils;

public class Buletin {
    private String nume;
    private String cod;

    public Buletin(int MAX) {
        this.nume = RandomStringUtils.randomAlphabetic(MAX);
        this.cod = RandomStringUtils.randomNumeric(6);
    }

    public String getNume() {
        return nume;
    }
}
