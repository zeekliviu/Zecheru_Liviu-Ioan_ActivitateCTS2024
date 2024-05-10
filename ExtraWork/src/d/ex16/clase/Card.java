package d.ex16.clase;

public class Card {
    private ContBancar modalitateDePlata;

    public Card(float soldRON, float soldEUR, float soldGBP)
    {
        System.out.printf("Sold RON: %.2f, Sold EUR: %.2f, Sold GBP: %.2f%n", soldRON, soldEUR, soldGBP);
        ContBancar contRON = new ContRON(soldRON);
        ContBancar contEUR = new ContEUR(soldEUR);
        ContBancar contGBP = new ContGBP(soldGBP);

        contRON.setSuccesor(contEUR);
        contEUR.setSuccesor(contGBP);

        this.modalitateDePlata = contRON;
    }

    public void plateste(float suma)
    {
        modalitateDePlata.plateste(suma);
    }
}
