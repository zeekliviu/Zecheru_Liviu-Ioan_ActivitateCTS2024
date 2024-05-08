package b.ex13.clase;

public class Ocupata implements Rezervabil {
    Ocupata(){}

    @Override
    public void schimbareStare(Rezervare rezervare) {
        rezervare.setStare(this);
    }
}
