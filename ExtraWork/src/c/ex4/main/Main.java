package c.ex4.main;

import c.ex4.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta retetaEtalon = new Reteta(15.7f, 34.54f, 2.35f);
        Reteta reteta1 = (Reteta)retetaEtalon.copiaza();
        reteta1.setCantitateSolutieBenzenol(4.56f);
        System.out.println(reteta1);
    }
}
