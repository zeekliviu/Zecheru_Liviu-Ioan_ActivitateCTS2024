package a.ex6.clase;

import java.util.List;

public class Medic {
    private final String nume;
    private final String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public boolean eInternabil(Pacient p)
    {
        return p.getDiagnostic().contains(specializare);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
