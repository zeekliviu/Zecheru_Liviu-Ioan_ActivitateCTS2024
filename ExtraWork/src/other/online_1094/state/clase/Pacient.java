package other.online_1094.state.clase;

public class Pacient {
    private String nume;
    private StarePacient stare;

    public Pacient(String nume)
    {
        this.nume = nume;
        this.stare = new Internat();
    }

    void setStare(StarePacient stare)
    {
        this.stare = stare;
    }

    public void seAgraveazaStarea()
    {
        if(this.stare instanceof Internat)
        {
            StarePacient subObservatie = new SubObservatie();
            subObservatie.setareStare(this);
            System.out.printf("Starea de sănătate a pacientului %s s-a agravat.%n", this.nume);
        }
        else {
            System.out.printf("Pacientul %s nu este internat.%n", this.nume);
        }
    }

    public void vindecare()
    {
        if(this.stare instanceof Internat)
        {
            StarePacient externat = new Externat();
            externat.setareStare(this);
            System.out.printf("Pacientul %s a fost externat.%n", this.nume);
        }
        else {
            System.out.printf("Pacientul %s nu poate fi externat.%n", this.nume);
        }
    }

    public void imbunatatireStare()
    {
        if(this.stare instanceof SubObservatie)
        {
            StarePacient internat = new Internat();
            internat.setareStare(this);
            System.out.printf("Starea de sănătate a lui %s s-a îmbunătățit.%n", this.nume);
        }
        else
        {
            System.out.printf("Pacientul %s nu era în stare gravă.%n", this.nume);
        }
    }
}
