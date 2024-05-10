package d.ex14.clase;

public class Bancomat extends RetragereBancomat{
    private float sold;

    public Bancomat(float sold) {
        this.sold = sold;
    }

    @Override
    protected void introduCard() {
        System.out.printf("Cardul a fost introdus. Sold: %.2f RON%n", this.sold);
    }

    @Override
    protected boolean solicitaSuma(float suma) {
        System.out.printf("Ai solicitat %.2f RON.%n", suma);
        return suma <= this.sold;
    }

    @Override
    protected void retrageSuma(float suma) {
        this.sold -= suma;
        System.out.printf("Noul sold %.2f RON%n", this.sold);
    }

    @Override
    protected void refuzaRetragere() {
        System.out.println("Sold insuficient!");
    }

    @Override
    protected void retrageCard() {
        System.out.println("Cardul a fost retras.");
    }
}
