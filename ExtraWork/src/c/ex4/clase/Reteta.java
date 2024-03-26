package c.ex4.clase;

public class Reteta implements Copiabil {
    private float cantitateSolutieDimetilTiamina;
    private float cantitateSolutieTributanFenol;
    private float cantitateSolutieBenzenol;

    public Reteta(float cantitateSolutieDimetilTiamina, float cantitateSolutieTributanFenol, float cantitateSolutieBenzenol) {
        if(cantitateSolutieDimetilTiamina < 0 || cantitateSolutieDimetilTiamina > 20)
            throw new IllegalArgumentException("Nu poti introduce atat dimetiltiamina in reteta! Interval acceptat [0; 20]");
        this.cantitateSolutieDimetilTiamina = cantitateSolutieDimetilTiamina;
        if(cantitateSolutieTributanFenol < 0 || cantitateSolutieTributanFenol > 100)
            throw new IllegalArgumentException("Nu poti introduce atat tributanfenol in reteta! Interval acceptat [0; 100]");
        this.cantitateSolutieTributanFenol = cantitateSolutieTributanFenol;
        if(cantitateSolutieBenzenol < 0 || cantitateSolutieBenzenol > 10)
            throw new IllegalArgumentException("Nu poti introduce atat benzenol in reteta! Interval acceptat [0; 10]");
        this.cantitateSolutieBenzenol = cantitateSolutieBenzenol;
    }

    private Reteta()
    {

    }

    public void setCantitateSolutieDimetilTiamina(float cantitateSolutieDimetilTiamina) {
        if(cantitateSolutieDimetilTiamina < 0 || cantitateSolutieDimetilTiamina > 20)
            throw new IllegalArgumentException("Nu poti introduce atat dimetiltiamina in reteta! Interval acceptat [0; 20]");

        this.cantitateSolutieDimetilTiamina = cantitateSolutieDimetilTiamina;
    }

    public void setCantitateSolutieTributanFenol(float cantitateSolutieTributanFenol) {
        if(cantitateSolutieTributanFenol < 0 || cantitateSolutieTributanFenol > 100)
            throw new IllegalArgumentException("Nu poti introduce atat tributanfenol in reteta! Interval acceptat [0; 100]");
        this.cantitateSolutieTributanFenol = cantitateSolutieTributanFenol;
    }

    public void setCantitateSolutieBenzenol(float cantitateSolutieBenzenol) {
        if(cantitateSolutieBenzenol < 0 || cantitateSolutieBenzenol > 10)
            throw new IllegalArgumentException("Nu poti introduce atat benzenol in reteta! Interval acceptat [0; 10]");
        this.cantitateSolutieBenzenol = cantitateSolutieBenzenol;
    }

    @Override
    public Copiabil copiaza() {
        Reteta reteta = new Reteta();
        reteta.cantitateSolutieBenzenol = this.cantitateSolutieBenzenol;
        reteta.cantitateSolutieTributanFenol = this.cantitateSolutieTributanFenol;
        reteta.cantitateSolutieDimetilTiamina = this.cantitateSolutieDimetilTiamina;
        return reteta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("cantitateSolutieDimetilTiamina=").append(cantitateSolutieDimetilTiamina);
        sb.append(", cantitateSolutieTributanFenol=").append(cantitateSolutieTributanFenol);
        sb.append(", cantitateSolutieBenzenol=").append(cantitateSolutieBenzenol);
        sb.append('}');
        return sb.toString();
    }
}
