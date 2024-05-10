package d.ex6.clase;

public class CardNormal implements Platibil{
    @Override
    public void plateste() {
        System.out.println("S-a realizat plata cu cardul la POS.");
    }
}
