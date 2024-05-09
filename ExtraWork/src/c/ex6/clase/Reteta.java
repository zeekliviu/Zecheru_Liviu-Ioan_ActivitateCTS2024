package c.ex6.clase;

import java.util.Map;

public class Reteta {
    private String emitent;
    private boolean valid;
    private Map<Integer, Integer> medicamente;

    public Reteta(String emitent, boolean valid, Map<Integer, Integer> medicamente)
    {
        this.emitent = emitent;
        this.valid = valid;
        this.medicamente = medicamente;
    }

    public boolean isValid() {
        return valid;
    }

    public Map<Integer, Integer> getMedicamente() {
        return medicamente;
    }

    public String getEmitent() {
        return emitent;
    }
}
