package c.ex6.clase;

import java.util.Map;

public class Farmacie {
    private Depozit depozit;

    public Farmacie()
    {
        this.depozit = new Depozit();
    }

    public boolean verificaReteta(Reteta reteta)
    {
        return reteta.isValid();
    }

    public boolean verificaStoc(Reteta reteta)
    {
        Map<Integer, Integer> stoc = this.depozit.getStoc();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : reteta.getMedicamente().entrySet()) {
            if(stoc.get(integerIntegerEntry.getKey())<integerIntegerEntry.getValue())
                return false;
        }
        return true;
    }

    public boolean areCard(Pacient pacient)
    {
        return pacient.isCardSanatate();
    }

    public void rezolvaReteta(Pacient pacient)
    {
        if(!areCard(pacient))
        {
            System.out.printf("Pacientul %s nu are card de sănătate.%n", pacient.getNume());
        }
        else
        {
            for (Reteta reteta : pacient.getRetete()) {
                if(!verificaReteta(reteta))
                {
                    System.out.printf("Rețeta emisă de %s a pacientului %s nu e valida!%n", reteta.getEmitent(), pacient.getNume());
                }
                else
                {
                    if (!verificaStoc(reteta))
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
}
