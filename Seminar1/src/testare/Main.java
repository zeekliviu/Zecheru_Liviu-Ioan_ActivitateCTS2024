package testare;


import model.acvatice.Caras;
import model.animale.Leu;
import model.animale.Zebră;
import model.zoo.Zoo;
import model.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Bucuresti", new ZooKeeper("Gigel"));
        zoo.adaugaVietate(new Leu(5, 4, "Symba"), "carne");
        zoo.adaugaVietate(new Zebră(7, 4, "Lizzy"), "fân");
        zoo.adaugaVietate(new Leu(6, 4, "Scar"), "carne");
        zoo.adaugaVietate(new Caras(2, "caras"), "alge");
        zoo.hranesteAnimalele();

        tipuriMancare tip = tipuriMancare.CARNIVOR;
    }

    public enum tipuriMancare
    {
        CARNIVOR,
        IERBIVOR,
        OMNIVOR
    }
}