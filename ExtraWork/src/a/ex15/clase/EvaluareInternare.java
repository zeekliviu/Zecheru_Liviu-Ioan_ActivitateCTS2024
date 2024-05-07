package a.ex15.clase;

public class EvaluareInternare implements Evaluabil{
    private Internabil pacient;
    public EvaluareInternare(Internabil pacient)
    {
        this.pacient = pacient;
    }
    @Override
    public void evalueaza() {
        this.pacient.interneaza();
    }
}
