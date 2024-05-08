package b.ex15.clase;

public class MasaOcupabila implements Ocupabil{
    @Override
    public void rezerva() {
        System.out.println("Masa ocupabilă a fost rezervată.");
    }

    @Override
    public void ocupa() {
        System.out.println("Masa ocupabilă a fost ocupată.");
    }
}
