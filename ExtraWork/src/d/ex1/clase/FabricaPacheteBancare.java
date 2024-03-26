package d.ex1.clase;

public abstract class FabricaPacheteBancare {
    public static PachetBancar getPachetBancar(TipPachetBancar tipPachetBancar, String denumire, float dobanda)
    {
        switch (tipPachetBancar) {
            case NEVOI_PERSONALE:
                return new NevoiPersonale(denumire, dobanda);
            case CREDIT_IPOTECAR:
                return new CreditIpotecar(denumire, dobanda);
            case null, default: throw new IllegalArgumentException("Tip bancar invalid!");
        }
    }
}
