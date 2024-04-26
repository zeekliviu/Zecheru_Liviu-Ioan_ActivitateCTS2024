package a.ex13.clase;

public class Pacient {
    private String nume;
    private StarePacient starePacient;

    public Pacient(String nume) {
        this.nume = nume;
        this.starePacient = new Externat();
    }

    public void interneazaPacient()
    {
        if(!(this.starePacient instanceof Internat))
        {
            this.starePacient = new Internat();
        }
        System.out.println(this);
    }

    public void punePacientSubObservatie()
    {
        if(this.starePacient instanceof Internat)
        {
            this.starePacient = new SubObservatie();
        }
        System.out.println(this);
    }

    public void externeazaPacient()
    {
        if(!(this.starePacient instanceof Externat))
        {
            this.starePacient = new Externat();
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.nume, this.starePacient.afiseaza());
    }
}
