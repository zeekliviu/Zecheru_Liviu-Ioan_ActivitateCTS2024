package c.ex3.clase;

public class Factura {
    private int nrPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;
    private Factura() {
        this.nrPungi = 0;
        this.plataCuCard = false;
        this.cardFidelitate = false;
        this.cotaTVA = 0;
    }
    public static class Builder implements Buildable
    {
        private final Factura factura;

        public Builder()
        {
            factura = new Factura();
        }

        public Builder setNrPungi(int nrPungi)
        {
            this.factura.nrPungi = nrPungi;
            return this;
        }
        public Builder setPlataCuCard(boolean plataCuCard)
        {
            this.factura.plataCuCard = plataCuCard;
            return this;
        }
        public Builder setCardFidelitate(boolean cardFidelitate)
        {
            this.factura.cardFidelitate = cardFidelitate;
            return this;
        }
        public Builder setCotaTVA(float cotaTVA)
        {
            this.factura.cotaTVA = cotaTVA;
            return this;
        }
        @Override
        public Factura build()
        {
            return this.factura;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
