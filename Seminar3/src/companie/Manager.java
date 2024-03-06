package companie;

public class Manager {
    private String nume;
    private float salariu;
    private int nrAngajati;
    private static Manager instanta = null; //= new Manager("Gigi", 10000.56f, 100); // eager initialization

    private Manager(String nume, float salariu, int nrAngajati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrAngajati = nrAngajati;
    }

    public synchronized static Manager getInstance(String nume, float salariu, int nrAngajati)
    {
        if(instanta==null){
            instanta = new Manager(nume, salariu, nrAngajati); // lazy initialization
        }
        return instanta;
    }

    public static Manager getInstance()
    {
        return getInstance("Pop", 9832f, 10);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Manager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
