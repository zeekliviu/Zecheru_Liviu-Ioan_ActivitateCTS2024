package c.ex6.main;

import c.ex6.clase.Farmacie;
import c.ex6.clase.Pacient;
import c.ex6.clase.Reteta;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class Main {
    static int NR_MAX_CHAR_NUME = 20;
    static int NR_MAX_RETETE = 5;
    static int NR_MAX_MEDICAMENTE_PER_RETETA = 2;
    static int NR_MAX_ID_MEDICAMENTE = 3;
    static int CANTITATE_MAXIMA = 10;
    static int NR_MAXIM_PACIENTI = 3;
    static Random rng = new Random();

    static Reteta[] getRetete()
    {
        int nrRetete = rng.nextInt(NR_MAX_RETETE)+1;
        Reteta[] retete = new Reteta[nrRetete];
        for (int i = 0; i < nrRetete; i++) {
            int nrMedicamente = rng.nextInt(NR_MAX_MEDICAMENTE_PER_RETETA)+1;
            Map<Integer, Integer> medicamente = new HashMap<>(nrMedicamente);
            for (int i1 = 0; i1 < nrMedicamente; i1++) {
                medicamente.put(rng.nextInt(NR_MAX_ID_MEDICAMENTE)+1, rng.nextInt(CANTITATE_MAXIMA)+1);
            }
            retete[i] = new Reteta(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)+1), rng.nextBoolean(), medicamente);
        }
        return retete;
    }

    static List<Pacient> getPacienti()
    {
        int nrPacienti = rng.nextInt(NR_MAXIM_PACIENTI)+1;
        List<Pacient> pacienti = new ArrayList<>(nrPacienti);
        for (int i = 0; i < nrPacienti; i++) {
            pacienti.add(new Pacient(RandomStringUtils.randomAlphabetic(NR_MAX_CHAR_NUME+1), rng.nextBoolean(), getRetete()));
        }
        return pacienti;
    }

    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie();
        List<Pacient> pacienti = getPacienti();

        System.out.println("--------------fara facade------------");
        for (Pacient pacient : pacienti) {
            if(!farmacie.areCard(pacient))
            {
                System.out.printf("Pacientul %s nu are card de sănătate.%n", pacient.getNume());
            }
            else
            {
                for (Reteta reteta : pacient.getRetete()) {
                    if(!farmacie.verificaReteta(reteta))
                    {
                        System.out.printf("Rețeta emisă de %s a pacientului %s nu e valida!%n", reteta.getEmitent(), pacient.getNume());
                    }
                    else
                    {
                        if (!farmacie.verificaStoc(reteta))
                        {
                            System.out.printf("Medicamentele rețetei emise de %s ale pacientului %s nu se găsesc pe stoc.%n", reteta.getEmitent(), pacient.getNume());
                        }
                        else {
                            System.out.printf("Rețeta emisă de %s a pacientului %s va fi cumpărată de la noi.%n", reteta.getEmitent(), pacient.getNume());
                        }
                    }
                }
            }
        }
        System.out.println("---------------cu facade------------------");
        pacienti.forEach(farmacie::rezolvaReteta);
    }
}
