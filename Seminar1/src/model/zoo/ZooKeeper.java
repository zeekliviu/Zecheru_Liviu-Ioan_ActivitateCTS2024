package model.zoo;

import model.animale.Vietate;

public class ZooKeeper {
    private String nume;

    public void hranesteAnimal(Vietate vietate, String mancare)
    {
        vietate.mananca(mancare);
    }

    public ZooKeeper(String nume) {
        this.nume = nume;
    }
}
