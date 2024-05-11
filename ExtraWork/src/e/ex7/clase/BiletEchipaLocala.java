package e.ex7.clase;

public class BiletEchipaLocala extends DecoratorAbstract{
    public BiletEchipaLocala(Tiparibil tiparibil) {
        super(tiparibil);
    }

    @Override
    public void tipareste() {
        System.out.println("Hai echipă!");
        super.tiparibil.tipareste();
    }
}
