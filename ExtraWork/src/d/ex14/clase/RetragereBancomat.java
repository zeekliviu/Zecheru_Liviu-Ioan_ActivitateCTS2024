package d.ex14.clase;

public abstract class RetragereBancomat {
    protected abstract void introduCard();
    protected abstract boolean solicitaSuma(float suma);
    protected abstract void retrageSuma(float suma);
    protected abstract void refuzaRetragere();
    protected abstract void retrageCard();

    public final void retrage(float suma)
    {
        introduCard();
        if(solicitaSuma(suma))
        {
            retrageSuma(suma);
        }
        else
        {
            refuzaRetragere();
        }
        retrageCard();
    }
}
