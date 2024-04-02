package other.singletonregistry.clase;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private Map<AColet, Aviz> jurnal;
    private static SingletonRegistry instanta;
    private SingletonRegistry()
    {
        jurnal = new HashMap<>();
    }

    public static synchronized SingletonRegistry getInstance() {
        if(instanta==null)
        {
            instanta = new SingletonRegistry();
        }
        return instanta;
    }
    public void adaugaAviz(AColet colet, LocalDate data)
    {
        jurnal.putIfAbsent(colet, new Aviz(data));
    }

    public Aviz getAviz(AColet colet)
    {
        return jurnal.get(colet);
    }
}
