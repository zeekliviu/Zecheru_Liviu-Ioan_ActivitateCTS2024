package other.online_adapter.soft_vechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{

    private List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    @Override
    public void printareBon() {
        final float[] suma = {0};
        System.out.println("Listă de produse:");
        this.listaProduse.forEach(produs -> {System.out.println(produs); suma[0] += produs.getPret();});
        System.out.printf("Total: %.2f%n", suma[0]);
    }

    @Override
    public void adaugareProdus(Produs produs) {
        listaProduse.add(produs);
    }
}
