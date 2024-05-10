package d.ex5.clase.vechi;

import d.ex5.clase.nou.CreditLeasing;

public class AdapterCreditFinanciar extends CreditLeasing {
    private Creditabil creditabil;

    public AdapterCreditFinanciar(Creditabil creditabil)
    {
        super(((CreditFinanciar)creditabil).getClient().getNume());
        this.creditabil = creditabil;
    }

    public void acordaCredit()
    {
        super.acordaCredit(super.getNume());
    }
}
