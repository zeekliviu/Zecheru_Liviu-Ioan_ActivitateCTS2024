package e.ex10.main;

import e.ex10.clase.Dimensiune;
import e.ex10.clase.Flyweight;
import e.ex10.clase.Pozitie;
import e.ex10.clase.Stadion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final int MAX_X = 100;
    static final int MAX_Y = 100;
    static final float MAX_H = 200f;
    static final float MAX_L = 50f;
    static final List<String> CULORI = new ArrayList<>(List.of("albastru", "galben", "roșu", "violet", "verde", "portocaliu", "negru", "alb", "maro", "gri"));
    static final Random rng = new Random();

    public static void main(String[] args) {
        Stadion stadion = new Stadion();

        Dimensiune dimensiune1 = new Dimensiune(rng.nextFloat(MAX_H), rng.nextFloat(MAX_L));
        Dimensiune dimensiune2 = new Dimensiune(rng.nextFloat(MAX_H), rng.nextFloat(MAX_L));

        int x = rng.nextInt(MAX_X);
        int y = rng.nextInt(MAX_Y);
        String culoareTricou = CULORI.get(rng.nextInt(CULORI.size()));

        stadion.getPersoana(x, y, culoareTricou).afiseaza(dimensiune1);
        stadion.getPersoana(x, y, culoareTricou).afiseaza(dimensiune2);
    }
}
