package d.ex4.main;

import d.ex4.clase.ContBancar;

public class Main {
    public static void main(String[] args) {
        ContBancar contEtalon = new ContBancar("RON", true, 10000);
        ContBancar contSecundar = (ContBancar) contEtalon.copiaza();
        contSecundar.seteContSalariu(false);
        contSecundar.setMoneda("EUR");
        System.out.println(contEtalon);
        System.out.println(contSecundar);
        ContBancar contExtern = (ContBancar) contEtalon.copiaza();
        contExtern.setMoneda("CZK");
    }
}
