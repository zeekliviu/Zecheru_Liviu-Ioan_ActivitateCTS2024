package d.ex16.clase;

public class ContRON extends ContBancar{
    private float sold;

    public ContRON(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float suma) {
        if(this.sold >= suma)
        {
            this.sold -= suma;
            System.out.printf("S-a plătit %.2f din contul de RON.%n", suma);
        }
        else
        {
            System.out.println("Sold insuficient în contul de RON.");
            super.succesor.plateste(suma);
        }
    }
}
