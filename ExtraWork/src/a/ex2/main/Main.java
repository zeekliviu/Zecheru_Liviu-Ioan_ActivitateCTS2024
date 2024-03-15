package a.ex2.main;

import a.ex2.clase.Personal;
import a.ex2.clase.PersonalFactory;
import a.ex2.clase.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonalFactory factory = new PersonalFactory();
        List<Personal> personal = new ArrayList<>();
        personal.add(factory.getPersonal(PersonalSpital.BRANCARDIER, "Ion", 25));
        personal.add(factory.getPersonal(PersonalSpital.ASISTENT, "Maria", 30));
        personal.add(factory.getPersonal(PersonalSpital.MEDIC, "Ana", 35));
        personal.forEach(Personal::prezentare);
    }
}
