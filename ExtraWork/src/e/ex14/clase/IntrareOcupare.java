package e.ex14.clase;

public abstract class IntrareOcupare {
    protected abstract void asezareLaCoada();
    protected abstract void prezintaBilet();
    protected abstract void controleazaCorporal();
    protected abstract void intraInStadion();
    protected abstract void ocupaLocul();

    public final void intraSiOcupa()
    {
        asezareLaCoada();
        prezintaBilet();
        controleazaCorporal();
        intraInStadion();
        ocupaLocul();
    }
}
