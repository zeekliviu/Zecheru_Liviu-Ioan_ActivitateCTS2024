package d.ex16.clase;

public class ContGBP extends ContBancar{
    private float sold;
    private static float GBP2RON = 5.79f;

    public ContGBP(float sold) {
        this.sold = sold;
    }


    @Override
    public void plateste(float suma) {
        if(GBP2RON*this.sold >= suma)
        {
            this.sold -= suma / GBP2RON;
            System.out.printf("S-a plătit %.2f RON (%.2f GBP) din contul de GBP.%n", suma, suma / GBP2RON);
        }
        else
        {
            System.out.println("Sold insuficient în contul de GBP.");
        }
    }
}
