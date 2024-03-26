package a.ex1.main;

import a.ex1.clase.AbstractBuilder;
import a.ex1.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builderPacient = new PacientBuilder().setAreHalat(true).setAreMicDejunInclus(true);
        System.out.println(builderPacient.build());
    }
}
