package other.online_adapter.soft_nou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBauturi;

    public Bar()
    {
        this.listaBauturi = new ArrayList<>();
    }

    public List<Bautura> getListaBauturi() {
        return listaBauturi;
    }

    public void adaugaBautura(Bautura bautura)
    {
        this.listaBauturi.add(bautura);
    }

    public void tiparireNotaDePlata()
    {
        final float[] total = {0};
        System.out.println("Lista băuturi:");
        this.listaBauturi.forEach(bautura -> {
            System.out.println(bautura);
            total[0] += bautura.getPret();
        });
        System.out.printf("Total: %.2f%n", total[0]);
    }
}
