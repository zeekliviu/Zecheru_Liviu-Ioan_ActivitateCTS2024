package anofm.main;

import anofm.ManagerRegistry;

public class Main {
    public static void main(String[] args) {
        ManagerRegistry registru = ManagerRegistry.getInstance();
        registru.inregistreazaManager("CTS SRL", "Popescu", 10000f);
        registru.inregistreazaManager("CTS SRL", "Ionescu", 20000f);
        System.out.println(registru.getManager("CTS SRL"));
    }
}
