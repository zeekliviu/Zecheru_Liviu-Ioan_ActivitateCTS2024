package e.ex6.clase;

import org.apache.commons.lang3.RandomStringUtils;

public class Bilet {
    private String nume;
    private String cod;

    public Bilet(String nume, int MAX) {
        this.cod = RandomStringUtils.randomAlphanumeric(MAX);
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public String getCod() {
        return cod;
    }
}
