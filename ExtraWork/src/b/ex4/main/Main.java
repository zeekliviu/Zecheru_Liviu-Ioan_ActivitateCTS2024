package b.ex4.main;

import b.ex4.clase.RezervareRestaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        RezervareRestaurant rezervareRestaurant = new RezervareRestaurant("Ion", 5, 12, new Date(new GregorianCalendar(2024, Calendar.JUNE, 20).getTimeInMillis()));
        RezervareRestaurant rezervareRestaurant2 = (RezervareRestaurant) rezervareRestaurant.cloneaza();
        rezervareRestaurant2.setDataRezervare(new Date(new GregorianCalendar(2024, Calendar.JUNE, 21).getTimeInMillis()));
        System.out.println(rezervareRestaurant);
        System.out.println(rezervareRestaurant2);
        RezervareRestaurant rezervareRestaurant3 = (RezervareRestaurant) rezervareRestaurant.cloneaza();
        rezervareRestaurant3.setNrPersoane(3);
        rezervareRestaurant3.setOraRezervare(18);
        System.out.println(rezervareRestaurant3);
    }
}
