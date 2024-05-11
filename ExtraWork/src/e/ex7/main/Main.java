package e.ex7.main;

import e.ex7.clase.Bilet;
import e.ex7.clase.BiletEchipaLocala;
import e.ex7.clase.DecoratorAbstract;
import e.ex7.clase.Tiparibil;

public class Main {
    public static void main(String[] args) {
        Tiparibil bilet = new Bilet();
        bilet.tipareste();

        DecoratorAbstract meciLocal = new BiletEchipaLocala(bilet);
        meciLocal.tipareste();
        DecoratorAbstract meciDubluLocal = new BiletEchipaLocala(meciLocal);
        meciDubluLocal.tipareste();
    }
}
