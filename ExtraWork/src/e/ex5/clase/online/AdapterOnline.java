package e.ex5.clase.online;

import e.ex5.clase.firma.Firma;

public class AdapterOnline extends Firma {
    private Rezervabil biletOnline;

    public AdapterOnline(Rezervabil biletOnline)
    {
        this.biletOnline = biletOnline;
    }

    public void cumparaBilet()
    {
        Online bilet = (Online)biletOnline;
        super.cumparaBilet(bilet.getMeci(), bilet.getLoc(), bilet.getNume());
    }
}
