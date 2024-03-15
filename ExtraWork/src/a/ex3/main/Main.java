package a.ex3.main;

import a.ex3.clase.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<FabricaPersonal> fabrici = new ArrayList<>();
        fabrici.add(new FabricaMedic());
        fabrici.add(new FabricaBrancardier());
        fabrici.add(new FabricaAsistent());
        List<String> nume = new ArrayList<>() {{
            add("Ion");
            add("Ana");
            add("Vasile");
        }};
        Random random = new Random();
        fabrici.forEach(fabricaPersonal -> {
            Personal personal = fabricaPersonal.getPersonal(nume.get(random.nextInt(nume.size())), random.nextInt(100));
            personal.prezentare();
        });
    }
}
