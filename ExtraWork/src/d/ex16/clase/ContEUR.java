package d.ex16.clase;

public class ContEUR extends ContBancar{
    private float sold;
    private static float EUR2RON = 4.98f;

    public ContEUR(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float suma) {
        if(EUR2RON*this.sold >= suma)
        {
            this.sold -= suma / EUR2RON;
            System.out.printf("S-a plătit %.2f RON (%.2f EUR) din contul de EUR.%n", suma, suma / EUR2RON);
        }
        else
        {
            System.out.println("Sold insuficient în contul de EUR.");
            super.succesor.plateste(suma);
        }
    }
}
