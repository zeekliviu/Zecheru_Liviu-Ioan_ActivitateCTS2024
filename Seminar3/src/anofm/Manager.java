package anofm;

public class Manager {
    private String numeFirma;
    private String numeManager;
    private float salariu;

    protected Manager(String numeFirma, String numeManager, float salariu) {
        this.numeFirma = numeFirma;
        this.numeManager = numeManager;
        this.salariu = salariu;
    }
    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Manager{");
        sb.append("numeFirma='").append(numeFirma).append('\'');
        sb.append(", numeManager='").append(numeManager).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
}
