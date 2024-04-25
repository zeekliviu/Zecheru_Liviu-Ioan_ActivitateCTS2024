package a.ex8.main;

import a.ex8.clase.Departament;
import a.ex8.clase.DepartamentSpital;
import a.ex8.clase.SectieSpital;
import a.ex8.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Departament spital = new Spital("Budimex");

        Departament departamentChirurgie = new DepartamentSpital("Chirurgie");
        Departament departamentOrtopedie = new DepartamentSpital("Ortopedie");

        Departament sectieChirurgie1 = new SectieSpital("Chirurgie pediatrică");
        Departament sectieChirurgie2 = new SectieSpital("Chirurgie neonatologică");
        Departament sectieChirurgie3 = new SectieSpital("Ortopedie pediatrică");

        spital.adauga(departamentChirurgie);
        spital.adauga(departamentOrtopedie);

        departamentChirurgie.adauga(sectieChirurgie1);
        departamentChirurgie.adauga(sectieChirurgie2);
        departamentOrtopedie.adauga(sectieChirurgie3);

        spital.afisare("asd");
        System.out.println("---------------------------");
        spital.sterge(departamentOrtopedie);
        spital.afisare("asd");
        System.out.println("---------------------------");
        departamentOrtopedie.afisare("");
    }
}
