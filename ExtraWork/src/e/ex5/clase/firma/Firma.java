package e.ex5.clase.firma;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Firma {
    private Map<String, List<Integer>> meciuri;

    public Firma()
    {
        this.meciuri = new HashMap<>(Map.of(
                "FCSB - Dinamo", new ArrayList<>(List.of(1, 2, 3, 4, 5)),
                "Chiajna - Panduri", new ArrayList<>(List.of(10, 16, 19, 20))
        ));
    }
    public void cumparaBilet(String meci, int loc, String nume)
    {
        if(this.meciuri.containsKey(meci))
        {
            if(this.meciuri.get(meci).contains(loc))
            {
                System.out.printf("S-a rezervat locul %d la meciul %s pentru %s%n", loc, meci, nume);
                this.meciuri.get(meci).remove(Integer.valueOf(loc));
                if(this.meciuri.get(meci).isEmpty())
                {
                    this.meciuri.remove(meci);
                }
            }
            else {
                System.out.printf("Locul %d nu e disponibil. Locuri disponibile: %s%n", loc, this.meciuri.get(meci));
            }
        }
        else
        {
            System.out.printf("Meciul %s nu există sau e SOLD OUT!%n", meci);
        }
    }
}
