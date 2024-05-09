package c.ex5.depozit;

import java.util.HashMap;
import java.util.Map;

public abstract class Depozit {
    protected Map<Integer, Integer> depozit;
    protected Depozit()
    {
        this.depozit = new HashMap<>(Map.of(
                1, 2,
                2, 1,
                3, 0
        ));
    }
}
