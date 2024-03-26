package d.ex3.clase;

public class ContBancar {
    private boolean eContSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    ContBancar()
    {

    }
    ContBancar(boolean eContSalariu, boolean areInternetBanking, boolean areCardAtasat)
    {
        this.eContSalariu = eContSalariu;
        this.areInternetBanking = areInternetBanking;
        this.areCardAtasat = areCardAtasat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContBancar{");
        sb.append("eContSalariu=").append(eContSalariu);
        sb.append(", areCardAtasat=").append(areCardAtasat);
        sb.append(", areInternetBanking=").append(areInternetBanking);
        sb.append('}');
        return sb.toString();
    }
}
