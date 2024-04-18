package a.ex6.main;

import a.ex6.clase.*;


public class Main {
    public static void main(String[] args) {
        Medic medicPrimar = new Medic("Dr. Georgescu", "ortopedie");
        Salon salon = new Salon(1304, 3);
        FacadeSpital facadeSpital = new FacadeSpital(medicPrimar, salon);
        Pacient[] pacientiInUrgenta = new Pacient[]
                {
                        new Pacient("Andrei", Stare.MODERAT, "[ortopedie] - fractura radius"),
                        new Pacient("Gigi", Stare.GRAV, "[ortopedie] - ruptura deget"),
                        new Pacient("Maria", Stare.USOR, "[chirurgie] - s-a ars cu ceainicul"),
                        new Pacient("Elena", Stare.ACCENTUAT, "[ortopedie] - luxatie"),
                        new Pacient("Cristi", Stare.GRAV, "[ortopedie] - fractura peroneu")
                };
        for(Pacient pacient:pacientiInUrgenta)
        {
            System.out.println(salon);
            facadeSpital.sePoateInterna(pacient);
        }
        System.out.println(salon);
        facadeSpital.sePoateInterna(pacientiInUrgenta[0]);
    }
}
