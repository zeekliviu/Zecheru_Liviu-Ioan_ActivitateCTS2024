package d.ex11.clase;

public class PersoanaFizica implements Solicitabil{
    @Override
    public void solicita() {
        System.out.println("S-au solicitat buletinul și adeverința de muncă.");
    }
}
