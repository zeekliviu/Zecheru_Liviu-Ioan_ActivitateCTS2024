package c.ex11.main;

import c.ex11.clase.Card;
import c.ex11.clase.Cash;
import c.ex11.clase.Medicament;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static float VALOARE_MAXIMA = 150f;
    static int NR_MAX_CHAR_DENUMIRE = 10;
    static Random rng = new Random();

    public static void main(String[] args) {
        Medicament m = new Medicament(RandomStringUtils.randomAlphanumeric(rng.nextInt(NR_MAX_CHAR_DENUMIRE)+1), rng.nextFloat(VALOARE_MAXIMA));
        while(m.getPret()>0.01f)
        {
            m.plateste(rng.nextFloat(m.getPret()));
            m.setModalitate(rng.nextBoolean() ? new Card() : new Cash());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
