package c.ex15.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacist {
    private List<Comanda> comenzi;

    public Farmacist()
    {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Comanda comanda)
    {
        this.comenzi.add(comanda);
    }

    public void executaComenzi()
    {
        System.out.println("Farmacistul trimite asistentul să aducă comenzile.");
        this.comenzi.forEach(Comanda::executa);
        this.comenzi.clear();
    }
}
