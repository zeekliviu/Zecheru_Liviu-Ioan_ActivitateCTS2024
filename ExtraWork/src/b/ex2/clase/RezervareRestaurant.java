package b.ex2.clase;

public class RezervareRestaurant {
    private boolean eAsezatLaGeam;
    private boolean areScaunErgonomic;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientalaPersonalizata;
    private String genMuzica;

    RezervareRestaurant()
    {
        this.eAsezatLaGeam = false;
        this.areScaunErgonomic = false;
        this.areMasaDecorata = false;
        this.areMuzicaAmbientalaPersonalizata = false;
        this.genMuzica = "";
    }
    public static class Builder
    {
        private final RezervareRestaurant rezervareRestaurant;

        public Builder()
        {
            this.rezervareRestaurant = new RezervareRestaurant();
        }

        public Builder setAsezatLaGeam(boolean eAsezatLaGeam)
        {
            this.rezervareRestaurant.eAsezatLaGeam = eAsezatLaGeam;
            return this;
        }

        public Builder setScaunErgonomic(boolean areScaunErgonomic)
        {
            this.rezervareRestaurant.areScaunErgonomic = areScaunErgonomic;
            return this;
        }

        public Builder setMasaDecorata(boolean areMasaDecorata)
        {
            this.rezervareRestaurant.areMasaDecorata = areMasaDecorata;
            return this;
        }

        public Builder setMuzicaAmbientalaPersonalizata(boolean areMuzicaAmbientalaPersonalizata)
        {
            this.rezervareRestaurant.areMuzicaAmbientalaPersonalizata = areMuzicaAmbientalaPersonalizata;
            return this;
        }

        public Builder setGenMuzica(String genMuzica)
        {
            this.rezervareRestaurant.areMuzicaAmbientalaPersonalizata = true;
            this.rezervareRestaurant.genMuzica = genMuzica;
            return this;
        }

        public RezervareRestaurant build()
        {
            return this.rezervareRestaurant;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RezervareRestaurant{");
        sb.append("eAsezatLaGeam=").append(eAsezatLaGeam);
        sb.append(", areScaunErgonomic=").append(areScaunErgonomic);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuzicaAmbientalaPersonalizata=").append(areMuzicaAmbientalaPersonalizata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
