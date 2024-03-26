package d.ex1.clase;

public class NevoiPersonale extends PachetBancar{
    NevoiPersonale(String denumire, float dobanda) {
        super(denumire, dobanda);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Creditul de nevoi personale cu denumirea " + super.getDenumire() + " are o dobanda de " + super.getDobanda() +"%.");

    }
}
