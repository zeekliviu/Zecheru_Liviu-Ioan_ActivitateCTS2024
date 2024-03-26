package d.ex1.clase;

public class CreditIpotecar extends PachetBancar{
    CreditIpotecar(String denumire, float dobanda) {
        super(denumire, dobanda);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Creditul ipotecar cu denumirea " + super.getDenumire() + " are o dobanda de " + super.getDobanda() +"%.");
    }
}
