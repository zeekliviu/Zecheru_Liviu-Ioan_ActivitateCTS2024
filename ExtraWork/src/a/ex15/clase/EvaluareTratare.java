package a.ex15.clase;

public class EvaluareTratare implements Evaluabil{
    private Internabil pacient;

    public EvaluareTratare(Internabil pacient) {
        this.pacient = pacient;
    }

    @Override
    public void evalueaza() {
        this.pacient.trateaza();
    }
}
