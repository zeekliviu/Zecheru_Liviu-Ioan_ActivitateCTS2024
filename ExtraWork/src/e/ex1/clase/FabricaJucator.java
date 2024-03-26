package e.ex1.clase;

public abstract class FabricaJucator {
    public static Jucator getJucator(TipJucator tipJucator, String nume, int nrJucator)
    {
        switch (tipJucator) {
            case PORTAR -> { return new Portar(nume, nrJucator);
            }
            case FUNDAS -> { return new Fundas(nume, nrJucator);
            }
            case ATACANT -> { return new Atacant(nume, nrJucator);
            }
            case null, default -> throw new IllegalArgumentException("Tip invalid!");
        }
    }
}
