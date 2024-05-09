package c.ex11.clase;

public class Cash implements Platibil{
    @Override
    public void plateste(float suma) {
        System.out.printf("s-a plătit %.2f RON cu bani gheață.%n", suma);
    }
}
