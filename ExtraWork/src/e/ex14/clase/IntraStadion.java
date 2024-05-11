package e.ex14.clase;

public class IntraStadion extends IntrareOcupare{
    @Override
    protected void asezareLaCoada() {
        System.out.println("Microbistul s-a asezat la coada.");
    }

    @Override
    protected void prezintaBilet() {
        System.out.println("Microbistul a prezentat biletul.");
    }

    @Override
    protected void controleazaCorporal() {
        System.out.println("Microbistul a fost supus unui control corporal.");
    }

    @Override
    protected void intraInStadion() {
        System.out.println("Microbistul a intrat in stadion.");
    }

    @Override
    protected void ocupaLocul() {
        System.out.println("Microbistul si-a ocupat locul.");
    }
}
