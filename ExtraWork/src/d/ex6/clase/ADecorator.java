package d.ex6.clase;

public abstract class ADecorator implements Platibil{
    protected Platibil card;
    public ADecorator(Platibil card)
    {
        this.card = card;
    }
}
