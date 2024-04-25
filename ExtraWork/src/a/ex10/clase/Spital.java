package a.ex10.clase;

import java.util.HashMap;
import java.util.Map;

public class Spital {
    private String denumire;
    private Map<String, Flyweight> pacienti;

    public Spital(String denumire) {
        this.denumire = denumire;
        this.pacienti = new HashMap<>();
    }

    public Flyweight getPacient(String telefon){
        return this.pacienti.get(telefon);
    }

    public void addPacient(Flyweight pacient)
    {
        this.pacienti.putIfAbsent(((Pacient)pacient).getNrTelefon(), pacient);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Spital{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pacienti=").append(pacienti);
        sb.append('}');
        return sb.toString();
    }
}
