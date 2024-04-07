package other.online_adapter.soft_vechi;

import other.online_adapter.soft_nou.Bar;
import other.online_adapter.soft_nou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie{
    @Override
    public void printareBon() {
        super.tiparireNotaDePlata();
    }

    @Override
    public void adaugareProdus(Produs produs) {
        Bautura b = new Bautura(produs.getPret(), produs.getDenumire(), 0);
        super.adaugaBautura(b);
    }
}
