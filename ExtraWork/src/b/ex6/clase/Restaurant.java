package b.ex6.clase;

import java.util.Random;

public class Restaurant {
    private Masa[] mese;
    private int nrMese;

    public Restaurant(int nrClienti)
    {
        Random randomGenerator = new Random();
        this.nrMese = randomGenerator.nextInt(10*nrClienti+1);
        System.out.printf("Numărul meselor alocate: %d%n", this.nrMese);
        this.mese = new Masa[this.nrMese];
        for(int i=0; i<this.nrMese; i++)
        {
            this.mese[i] = new Masa(randomGenerator.nextBoolean(), randomGenerator.nextBoolean(), randomGenerator.nextBoolean());
        }
    }

    public void rezervaMasa(Client c)
    {
        String numeClient = c.getNume();
        for(int i = 0 ; i < this.nrMese; i++)
        {
            if(mese[i].eOk())
            {
                System.out.printf("Clientul %s a rezervat masa %d care a îndeplinit condițiile.%n", numeClient, i);
                mese[i].ocupa();
                return;
            }
        }
        System.out.printf("Nu s-a găsit nicio masă liberă pentru clientul %s%n", numeClient);
    }
}
