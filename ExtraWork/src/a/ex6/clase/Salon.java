package a.ex6.clase;

import java.util.Arrays;

public class Salon {
    private int cod;
    private final Boolean[] paturi; // false - ocupat, true - liber

    public Salon(int cod, int nrPaturi) {
        this.cod = cod;
        this.paturi = new Boolean[nrPaturi];
        for(int i=0; i<nrPaturi; i++)
        {
            this.paturi[i] = true;
        }
    }

    public void ocupaPat(int index)
    {
        if(index >= 0 && index < this.paturi.length)
        {
            this.paturi[index] = false;
        }
    }

    public void elibereazaPat(int index)
    {
        if(index >= 0 && index < this.paturi.length)
        {
            this.paturi[index] = true;
        }
    }

    public boolean eVreunPatLiber()
    {
        for(int i=0; i<this.paturi.length; i++)
        {
            if(this.paturi[i])
            {
                this.paturi[i] = false;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Salon{");
        sb.append("cod=").append(cod);
        sb.append(", paturi=").append(paturi == null ? "null" : Arrays.asList(paturi).toString());
        sb.append('}');
        return sb.toString();
    }
}
