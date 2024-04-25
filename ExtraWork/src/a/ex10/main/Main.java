package a.ex10.main;

import a.ex10.clase.Flyweight;
import a.ex10.clase.Internare;
import a.ex10.clase.Pacient;
import a.ex10.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Spital spital = new Spital("Budimex");
        Flyweight pacient1 = new Pacient("Andrei", "0723410033", "Strada Mierlelor, 12A");
        Flyweight pacient2 = new Pacient("Mircea", "0723410034", "Strada Mierlelor, 17");
        Flyweight pacient3 = new Pacient("Ana", "0723410035", "Strada Mierlelor, 21");

        Internare internare1 = new Internare(102, 3, 1);
        Internare internare2 = new Internare(104, 2, 2);
        Internare internare3 = new Internare(106, 1, 3);

        spital.addPacient(pacient1);
        spital.addPacient(pacient2);
        spital.addPacient(pacient3);

        pacient1.afiseazaInformatii(internare1);
        pacient1.afiseazaInformatii(internare1);
        pacient1.afiseazaInformatii(internare1);
        pacient1.afiseazaInformatii(internare3);
        pacient1.afiseazaInformatii(internare3);

        pacient3.afiseazaInformatii(internare2);
        pacient3.afiseazaInformatii(internare2);

        System.out.println(spital);
    }
}
