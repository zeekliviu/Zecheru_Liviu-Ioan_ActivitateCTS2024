package a.ex13.main;

import a.ex13.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Titi");
        pacient.interneazaPacient();
        pacient.externeazaPacient();
        pacient.punePacientSubObservatie();
        pacient.interneazaPacient();
        pacient.punePacientSubObservatie();
        pacient.externeazaPacient();
    }
}
