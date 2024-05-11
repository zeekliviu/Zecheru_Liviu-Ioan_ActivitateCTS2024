package e.ex11.clase;

public class TribunaVIP implements Verificabil{
    @Override
    public void verifica() {
        System.out.println("Se verifică doar biletul.");
    }
}
