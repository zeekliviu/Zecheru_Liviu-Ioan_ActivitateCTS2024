package d.ex14.main;

import d.ex14.clase.Bancomat;
import d.ex14.clase.RetragereBancomat;

import java.util.Random;

public class Main {
    static final float MAX_SOLD = 1000f;
    static final Random rng = new Random();
    public static void main(String[] args) {
        RetragereBancomat bancomat = new Bancomat(rng.nextFloat(MAX_SOLD));
        bancomat.retrage(rng.nextFloat(MAX_SOLD));
    }
}
