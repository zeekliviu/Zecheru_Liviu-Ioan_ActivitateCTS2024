package b.ex13.clase;

public class Rezervata implements Rezervabil{
    Rezervata(){}

    @Override
    public void schimbareStare(Rezervare rezervare) {
        rezervare.setStare(this);
    }
}
