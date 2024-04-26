package a.ex14.clase;

public class EmitereFisa extends Internare{
    @Override
    public void interneaza(String numePacient) {
        System.out.printf("S-a emis fisa de internare pentru pacientul %s.%n", numePacient);
    }
}
