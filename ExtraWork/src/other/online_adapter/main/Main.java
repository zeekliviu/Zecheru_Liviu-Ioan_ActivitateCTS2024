package other.online_adapter.main;

import other.online_adapter.soft_nou.Bar;
import other.online_adapter.soft_nou.Bautura;
import other.online_adapter.soft_vechi.*;

public class Main {
    public static void platesteConsumatia(SoftBucatarie bucatarie)
    {
        bucatarie.printareBon();
    }
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        bucatarie.adaugareProdus(new Produs("Pizza", 35.5f));
        bucatarie.adaugareProdus(new Produs("Paste Bolognese", 40.2f));
        platesteConsumatia(bucatarie);

        Bar bar = new Bar();
        bar.adaugaBautura(new Bautura(12.4f, "Cola", 0f));
        bar.adaugaBautura(new Bautura(20.99f, "Mojito", 12.5f));

        AdapterComandaBarBucatarie adapter = new AdapterComandaBarBucatarie();
        adapter.adaugaBautura(new Bautura(11.42f, "Pepsi", 0f));
        adapter.adaugaBautura(new Bautura(10.39f, "Mirinda", 0f));
        adapter.adaugaBautura(new Bautura(10.72f, "Schweppes", 0f));

        Bautura bautura = new Bautura(3f, "Vittel", 0);
        AdapterBauturaProdus adaptor = new AdapterBauturaProdus(bautura);
        adapter.adaugareProdus(adaptor);

        platesteConsumatia(adapter);
    }
}
