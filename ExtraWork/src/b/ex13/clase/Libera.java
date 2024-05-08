package b.ex13.clase;

public class Libera implements Rezervabil {
    Libera(){}

    @Override
    public void schimbareStare(Rezervare rezervare) {
        rezervare.setStare(this);
    }
}
