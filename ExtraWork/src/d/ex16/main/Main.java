package d.ex16.main;

import d.ex16.clase.Card;

import java.util.Random;

public class Main {
    static final float SOLD_MAXIM_RON = 1000f;
    static final float SOLD_MAXIM_EUR = 200f;
    static final float SOLD_MAXIM_GBP = 50f;
    static final float MAX_PLATA = 100f;
    static final Random rng = new Random();
    public static void main(String[] args) {

        Card card = new Card(rng.nextFloat(SOLD_MAXIM_RON), rng.nextFloat(SOLD_MAXIM_EUR), rng.nextFloat(SOLD_MAXIM_GBP));
        while(true)
        {
            card.plateste(rng.nextFloat(MAX_PLATA));
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
