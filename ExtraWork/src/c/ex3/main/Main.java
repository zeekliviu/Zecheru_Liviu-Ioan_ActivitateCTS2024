package c.ex3.main;

import c.ex3.clase.Factura;

public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura.Builder().setNrPungi(3).setCotaTVA(0.19f).build();
        System.out.println(f1);
    }
}
