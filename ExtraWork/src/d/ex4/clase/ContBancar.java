package d.ex4.clase;

import static java.util.Arrays.asList;

public class ContBancar implements Copiabil {
    private String moneda;
    private boolean eContSalariu;
    private float sold;

    public ContBancar(String moneda, boolean eContSalariu, float sold) {
        if(!asList(new String[]{"RON", "GBP", "EUR"}).contains(moneda))
            throw new IllegalArgumentException("Moneda neacceptata!");
        this.moneda = moneda;
        this.eContSalariu = eContSalariu;
        if(sold < 100)
            throw new IllegalArgumentException("Sold prea mic!");
        this.sold = sold;
    }

    public void setMoneda(String moneda) {
        if(!asList("RON", "GBP", "EUR").contains(moneda))
            throw new IllegalArgumentException("Moneda neacceptata!");
        this.moneda = moneda;
    }

    public void seteContSalariu(boolean eContSalariu) {
        this.eContSalariu = eContSalariu;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("moneda='").append(moneda).append('\'');
        sb.append(", eContSalariu=").append(eContSalariu);
        sb.append(", sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }

    public void setSold(float sold) {
        if(sold < 100)
            throw new IllegalArgumentException("Sold prea mic!");
        this.sold = sold;
    }

    private ContBancar(){}

    @Override
    public Copiabil copiaza() {
        var nou = new ContBancar();
        nou.eContSalariu = this.eContSalariu;
        nou.moneda = this.moneda;
        nou.sold = this.sold;
        return nou;
    }
}
