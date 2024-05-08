package b.ex13.clase;

public class Rezervare {
    private int nrPersoane;
    private String numePersoana;
    private Rezervabil stare;
    private static final Rezervabil stareLibera = new Libera();
    private static final Rezervabil stareOcupata = new Ocupata();
    private static final Rezervabil stareRezervata = new Rezervata();

    public Rezervare(int nrPersoane, String numePersoana) {
        this.nrPersoane = nrPersoane;
        this.numePersoana = numePersoana;
        this.stare = stareRezervata;
    }

    void setStare(Rezervabil stare) {
        this.stare = stare;
    }

    public void setStareOcupata()
    {
        if(this.stare instanceof Rezervata)
        {
            stareOcupata.schimbareStare(this);
            System.out.printf("Rezervarea de %d persoane a lui %s a trecut în starea ocupată.%n", this.nrPersoane, this.numePersoana);
        }
        else
        {
            System.out.printf("Rezervarea de %d persoane a lui %s nu poate fi ocupată.%n", this.nrPersoane, this.numePersoana);
        }
    }

    public void setStareLibera()
    {
        if(this.stare instanceof Ocupata)
        {
            stareLibera.schimbareStare(this);
            System.out.printf("Rezervarea de %d persoane a lui %s a trecut în starea liberă.%n", this.nrPersoane, this.numePersoana);
        }
        else
        {
            System.out.printf("Rezervarea de %d persoane a lui %s nu poate fi eliberată.%n", this.nrPersoane, this.numePersoana);
        }
    }

    public void setStareRezervata()
    {
        if(this.stare instanceof Libera)
        {
            stareRezervata.schimbareStare(this);
            System.out.printf("Rezervarea de %d persoane a lui %s a trecut în starea rezervată.%n", this.nrPersoane, this.numePersoana);
        }
        else
        {
            System.out.printf("Rezervarea de %d persoane a lui %s nu poate fi rezervată.%n", this.nrPersoane, this.numePersoana);
        }
    }
}
