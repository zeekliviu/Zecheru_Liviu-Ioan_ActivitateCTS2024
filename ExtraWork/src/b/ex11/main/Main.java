package b.ex11.main;

import b.ex11.clase.Card;
import b.ex11.clase.Factura;
import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(RandomStringUtils.randomAlphabetic(20));
        f1.plateste(100.5f);
        f1.setModPlata(new Card());
        f1.plateste(200.3f);
    }
}
