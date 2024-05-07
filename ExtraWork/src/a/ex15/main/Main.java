package a.ex15.main;

import a.ex15.clase.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static byte NR_MAXIM_CARACTERE_NUME = 10;
    static byte VARSTA_MAXIMA = 100;
    static byte NR_MAXIM_PACIENTI = 20;
    static List<Internabil> getPacienti(Random rng)
    {
        byte nrPacienti = (byte) rng.nextInt(NR_MAXIM_PACIENTI);
        List<Internabil> pacienti = new ArrayList<>(nrPacienti);
        for(byte i = 0; i < nrPacienti; i++)
        {
            if(rng.nextBoolean())
            {
                pacienti.add(new PacientTratabil(RandomStringUtils.randomAlphabetic(NR_MAXIM_CARACTERE_NUME), (byte)rng.nextInt(VARSTA_MAXIMA)));
            }
            else
            {
                pacienti.add(new PacientInternabil(RandomStringUtils.randomAlphabetic(NR_MAXIM_CARACTERE_NUME), (byte)rng.nextInt(VARSTA_MAXIMA)));
            }
        }
        return pacienti;
    }
    public static void main(String[] args) {
        Random rng = new Random();
        List<Internabil> pacienti = getPacienti(rng);
        OperatorTriaj operatorTriaj = new OperatorTriaj();
        pacienti.forEach(pacient -> {
            Evaluabil evaluare;
            if(rng.nextBoolean())
            {
                evaluare = new EvaluareInternare(pacient);
            }
            else
            {
                evaluare = new EvaluareTratare(pacient);
            }
            operatorTriaj.invoca(evaluare);
        });
    }
}
