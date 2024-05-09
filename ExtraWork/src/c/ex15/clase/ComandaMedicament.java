package c.ex15.clase;

public class ComandaMedicament implements Comanda{
    private String medicament;
    private Asistent asistent;

    public ComandaMedicament(Asistent asistent, String medicament) {
        this.asistent = asistent;
        this.medicament = medicament;
    }

    @Override
    public void executa() {
        asistent.aduMedicament(this.medicament);
    }
}
