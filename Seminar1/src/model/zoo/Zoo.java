package model.zoo;

import model.animale.Vietate;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper ingrijitor;
    private Map<Vietate, String> animale;

    public Zoo(String name, ZooKeeper ingrijitor) {
        this.name = name;
        this.ingrijitor = ingrijitor;
        this.animale = null;
    }

    public void adaugaVietate(Vietate vietate, String mancare)
    {
        if(animale == null)
        {
            animale = new HashMap<>();
        }
        animale.put(vietate, mancare);
    }

    public void hranesteAnimalele()
    {
        if(animale!=null)
        {
            for(var v: animale.keySet())
            {
                ingrijitor.hranesteAnimal(v, animale.get(v));
            }
        }
    }
}
