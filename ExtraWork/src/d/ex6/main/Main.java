package d.ex6.main;

import d.ex6.clase.ADecorator;
import d.ex6.clase.CardOnline;
import d.ex6.clase.ContactLess;
import d.ex6.clase.Platibil;

public class Main {
    public static void main(String[] args) {
        Platibil cardOnline = new CardOnline();
        cardOnline.plateste();
        System.out.println("-----------adaugare functie contactless-------------");
        ADecorator contactLess = new ContactLess(cardOnline);
        contactLess.plateste();
    }
}
