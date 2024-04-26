package a.ex14.clase;

public class EvaluarePacient extends Internare{
    @Override
    public void interneaza(String numePacient) {
        System.out.printf("S-a verificat starea pacientului %s.%n", numePacient);
        super.succesor.interneaza(numePacient);
    }
}
