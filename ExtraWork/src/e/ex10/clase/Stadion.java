package e.ex10.clase;

import java.util.ArrayList;
import java.util.List;

public class Stadion {
    private List<Flyweight> persoane;

    public Stadion()
    {
        this.persoane = new ArrayList<>();
    }

    public Flyweight getPersoana(int x, int y, String culoareTricou)
    {
        for (Flyweight flyweight : this.persoane) {
            Pozitie p = (Pozitie) flyweight;
            if(p.eAcesta(x, y, culoareTricou))
                return flyweight;
        }
        Flyweight p = new Pozitie(culoareTricou, x, y);
        this.persoane.add(p);
        return p;
    }
}
