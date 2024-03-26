package b.ex2.main;

import b.ex2.clase.RezervareRestaurant;

public class Main {
    public static void main(String[] args) {
        RezervareRestaurant rezervareRestaurant = new RezervareRestaurant.Builder()
                .setAsezatLaGeam(true)
                .setGenMuzica("Rock")
                .build();
        System.out.println(rezervareRestaurant);
    }
}
