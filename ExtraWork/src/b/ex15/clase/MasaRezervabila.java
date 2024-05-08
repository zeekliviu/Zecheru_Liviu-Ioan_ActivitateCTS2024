package b.ex15.clase;

public class MasaRezervabila implements Ocupabil{
    @Override
    public void rezerva() {
        System.out.println("Masa rezervabilă a fost rezervată.");
    }

    @Override
    public void ocupa() {
        System.out.println("Masa rezervabilă a fost ocupată.");
    }
}
