package d.ex3.main;

import d.ex3.clase.BuilderContBancar;
import d.ex3.clase.ContBancar;

public class Main {
    public static void main(String[] args) {
        BuilderContBancar builderContBancar = new BuilderContBancar();
        ContBancar cb1 = builderContBancar.seteContSalariu(true).setAreCardAtasat(true).build();
        ContBancar cb2 = builderContBancar.setAreInternetBanking(true).build();
        ContBancar cb3 = builderContBancar.build();
        System.out.println(cb1);
        System.out.println(cb2);
        System.out.println(cb3);
    }
}
