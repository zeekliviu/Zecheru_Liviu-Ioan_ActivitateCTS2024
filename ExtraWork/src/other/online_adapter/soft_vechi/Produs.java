package other.online_adapter.soft_vechi;

public class Produs {
    private String denumire;
    private float pret;

    public Produs(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Produs{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
