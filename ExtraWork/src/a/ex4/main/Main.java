package a.ex4.main;

import a.ex4.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta retetaEtalon = new Reteta(10, 5, 25);
        Reteta reteta1 = (Reteta) retetaEtalon.copiaza();
        reteta1.setCantitateMorfina(90);
        System.out.println(reteta1);
        Reteta reteta2 = (Reteta) retetaEtalon.copiaza();
        reteta2.setCantitateChinina(10);
        Reteta reteta3 = (Reteta) retetaEtalon.copiaza();
        reteta3.setCantitateErgotamina(30);
        System.out.println(reteta2);
        System.out.println(reteta3);
    }
}
