package a.ex14.clase;

public class InternarePacient {
    private String nume;
    private Internare internare;

    public InternarePacient(String nume) {
        this.nume = nume;
        Internare evaluare = new EvaluarePacient();
        Internare verificareDisponibilitate = new VerificareDisponibilitateSalon();
        Internare emitereFisa = new EmitereFisa();

        this.internare = evaluare;
        evaluare.setSuccesor(verificareDisponibilitate);
        verificareDisponibilitate.setSuccesor(emitereFisa);
    }

    public void interneaza()
    {
        internare.interneaza(this.nume);
    }
}
