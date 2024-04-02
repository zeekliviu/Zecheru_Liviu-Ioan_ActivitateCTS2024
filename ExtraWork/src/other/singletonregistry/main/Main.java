package other.singletonregistry.main;

import other.singletonregistry.clase.AColet;
import other.singletonregistry.clase.Colet;
import other.singletonregistry.clase.SingletonRegistry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AColet colet1 = new Colet("Liviu", "Patrick", 10.2f, true);
        AColet colet2 = new Colet("Liviu", "Dragoș", 5.4f, true);
        AColet colet3 = new Colet("Patrick", "Dragoș", 2.1f, false);
        SingletonRegistry jurnalColete = SingletonRegistry.getInstance();
        jurnalColete.adaugaAviz(colet1, LocalDate.of(2024, 4, 6));
        jurnalColete.adaugaAviz(colet2, LocalDate.of(2024, 4, 10));
        jurnalColete.adaugaAviz(colet3, LocalDate.of(2024, 4, 16));
        System.out.println(jurnalColete.getAviz(colet1));
        jurnalColete.adaugaAviz(colet1, LocalDate.of(2024, 4, 7));
        System.out.println(jurnalColete.getAviz(colet1));
    }
}
