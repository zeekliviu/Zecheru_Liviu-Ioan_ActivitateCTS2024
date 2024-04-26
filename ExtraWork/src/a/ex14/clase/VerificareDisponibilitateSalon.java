package a.ex14.clase;

public class VerificareDisponibilitateSalon extends Internare{
    @Override
    public void interneaza(String numePacient) {
        System.out.printf("S-a verificat disponibilitatea salonului pentru pacientul %s.%n", numePacient);
        super.succesor.interneaza(numePacient);
    }
}
