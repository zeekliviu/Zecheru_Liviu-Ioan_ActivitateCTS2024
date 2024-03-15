package a.ex2.clase;

public class PersonalFactory {
    public Personal getPersonal(PersonalSpital tip, String nume, int varsta) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier(nume, varsta);
            case ASISTENT:
                return new Asistent(nume, varsta);
            case MEDIC:
                return new Medic(nume, varsta);
            default:
                throw new IllegalArgumentException("Tipul nu este corect!");
        }
    }
}
