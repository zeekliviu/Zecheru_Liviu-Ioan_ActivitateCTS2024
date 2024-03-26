package f.ex3.main;

import f.ex3.clase.AutobuzLinie;
import f.ex3.clase.BuilderAutobuz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BuilderAutobuz builderAutobuz = new BuilderAutobuz();
        AutobuzLinie a1 = builderAutobuz.setDeschideUsi(true).build();
        AutobuzLinie a2 = builderAutobuz.setModel("Citaro").setOpresteLaCapat(true).setSofer("Gigel").build();
        AutobuzLinie a3 = builderAutobuz.setTextEcran("La multi ani, 2004!").build();
        List<AutobuzLinie> parcAutobuze = List.of(a1, a2, a3);
        parcAutobuze.forEach(System.out::println);
    }
}
