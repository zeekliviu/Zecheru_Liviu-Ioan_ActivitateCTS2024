package e.ex6.main;

import e.ex6.clase.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final int NR_MAX_CHAR_NUME = 10;
    static final int NR_MAX_CHAR_COD_BILET = 15;
    static final int NR_MAX_PERSOANE = 20;
    static final Random rng = new Random();
    static final Politie politie = new Politie();

    static List<Persoana> getMicrobisti()
    {
        int nrPersoane = rng.nextInt(NR_MAX_PERSOANE)+1;
        List<Persoana> persoane = new ArrayList<>(nrPersoane);
        for (int i = 0; i < nrPersoane; i++) {
            Buletin buletin = new Buletin(rng.nextInt(NR_MAX_CHAR_NUME)+1);
            Bilet bilet = new Bilet(rng.nextBoolean() ? buletin.getNume() : RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)+1), NR_MAX_CHAR_COD_BILET);
            persoane.add(new Persoana(bilet, buletin, rng.nextBoolean()));
            if(rng.nextBoolean())
            {
                politie.adaugaSuspect(buletin);
            }
        }
        return persoane;
    }

    public static void main(String[] args) {
        List<Persoana> persoane = getMicrobisti();
        Operator operator = new Operator();
        System.out.println("-----------FARA FACADE----------");
        persoane.forEach(persoana -> {
            if(operator.verificaBilet(persoana.getBuletin(), persoana.getBilet())
                &&
            !operator.cautataPolitie(politie, persoana.getBuletin())
                &&
            !operator.areAntecedente(persoana))
            {
                System.out.println("Acces permis!");
            }
            else
            {
                System.out.println("Acces interzis!");
            }
        });
        System.out.println("-----------CU FACADE------------");
        persoane.forEach(persoana -> operator.permiteAcces(politie, persoana));
    }
}
