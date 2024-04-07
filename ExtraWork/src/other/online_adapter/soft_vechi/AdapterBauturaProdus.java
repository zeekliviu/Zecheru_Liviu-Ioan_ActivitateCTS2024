package other.online_adapter.soft_vechi;

import other.online_adapter.soft_nou.Bautura;

public class AdapterBauturaProdus extends Produs{
    private Bautura bautura;
    public AdapterBauturaProdus(Bautura bautura)
    {
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }
}
