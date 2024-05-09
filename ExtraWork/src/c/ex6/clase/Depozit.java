package c.ex6.clase;

import java.util.HashMap;
import java.util.Map;

public class Depozit {
    private Map<Integer, Integer> stoc;
    public Depozit()
    {
        this.stoc = new HashMap<>(Map.of(
                1, 5,
                2, 3,
                3, 2
        ));
    }

    public Map<Integer, Integer> getStoc() {
        return stoc;
    }
}
