package c.ex11.clase;

public class Card implements Platibil{
    @Override
    public void plateste(float suma) {
        System.out.printf("s-a plătit %.2f RON cu cardul.%n", suma);
    }
}
