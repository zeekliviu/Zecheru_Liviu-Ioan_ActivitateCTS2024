package e.ex6.clase;

import java.util.ArrayList;
import java.util.List;

public class Politie {
    private List<Buletin> cautatiDePolitie;

    public Politie()
    {
        this.cautatiDePolitie = new ArrayList<>();
    }

    public void adaugaSuspect(Buletin suspect)
    {
        this.cautatiDePolitie.add(suspect);
    }

    public boolean eCautatDePolitie(Buletin suspect)
    {
        return this.cautatiDePolitie.contains(suspect);
    }
}
