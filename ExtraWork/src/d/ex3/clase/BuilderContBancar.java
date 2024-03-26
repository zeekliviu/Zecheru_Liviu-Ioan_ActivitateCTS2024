package d.ex3.clase;

public class BuilderContBancar implements Buildable{
    private boolean eContSalariu;
    private boolean areCardAtasat;
    private boolean areInternetBanking;

    public BuilderContBancar seteContSalariu(boolean eContSalariu) {
        this.eContSalariu = eContSalariu;
        return this;
    }

    public BuilderContBancar setAreCardAtasat(boolean areCardAtasat) {
        this.areCardAtasat = areCardAtasat;
        return this;
    }

    public BuilderContBancar setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
        return this;
    }

    @Override
    public ContBancar build() {
        boolean cp1 = this.eContSalariu, cp2 = this.areCardAtasat, cp3 = this.areInternetBanking;
        this.eContSalariu = false;
        this.areCardAtasat = false;
        this.areInternetBanking = false;
        return new ContBancar(cp1, cp3, cp2);
    }
}
