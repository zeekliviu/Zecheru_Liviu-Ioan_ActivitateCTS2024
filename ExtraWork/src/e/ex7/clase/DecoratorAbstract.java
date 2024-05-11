package e.ex7.clase;

public abstract class DecoratorAbstract implements Tiparibil{
    protected Tiparibil tiparibil;
    protected DecoratorAbstract(Tiparibil tiparibil){this.tiparibil = tiparibil;}
}
