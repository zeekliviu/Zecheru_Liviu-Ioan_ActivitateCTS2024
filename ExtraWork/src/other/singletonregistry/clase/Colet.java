package other.singletonregistry.clase;

public class Colet extends AColet{
    private boolean important;
    public Colet(String expeditor, String destinatar, float greutate, boolean important) {
        super(expeditor, destinatar, greutate);
        this.important = important;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Colet{");
        sb.append("important=").append(important);
        sb.append(", expeditor='").append(super.expeditor).append('\'');
        sb.append(", destinatar='").append(super.destinatar).append('\'');
        sb.append(", greutate=").append(super.greutate);
        sb.append(", nrPachete=").append(super.nrPachete);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaCost() {
        System.out.printf("Costul este %f lei.%n", super.greutate*super.nrPachete);
    }
}
