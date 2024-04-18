package a.ex6.clase;

import java.util.List;

public class Pacient {
    private final String nume;
    private final Stare stare;
    private final String diagnostic;
    private static final List<Stare> stariInternabile = List.of(Stare.MODERAT, Stare.GRAV);

    public Pacient(String nume, Stare stare, String diagnostic) {
        this.nume = nume;
        this.stare = stare;
        this.diagnostic = diagnostic;
    }

    public Stare getStare() {
        return stare;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public boolean eInternabil()
    {
        return stariInternabile.contains(this.stare);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", stare=").append(stare);
        sb.append('}');
        return sb.toString();
    }
}
