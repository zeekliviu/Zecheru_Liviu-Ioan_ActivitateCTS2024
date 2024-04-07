package other.online_adapter.soft_nou;

public class Bautura {
    private float pret;
    private String denumire;
    private float gradAlcool;

    public Bautura(float pret, String denumire, float gradAlcool) {
        this.pret = pret;
        this.denumire = denumire;
        this.gradAlcool = gradAlcool;
    }

    public float getPret() {
        return pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getGradAlcool() {
        return gradAlcool;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bautura{");
        sb.append("pret=").append(pret);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", gradAlcool=").append(gradAlcool);
        sb.append('}');
        return sb.toString();
    }
}
