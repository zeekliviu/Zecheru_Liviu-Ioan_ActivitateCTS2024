package other.singletonregistry.clase;

public abstract class AColet {
    protected String expeditor;
    protected String destinatar;
    protected float greutate;
    protected int nrPachete;

    protected AColet(String expeditor, String destinatar, float greutate) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.greutate = greutate;
    }

    public abstract void afiseazaCost();
}
