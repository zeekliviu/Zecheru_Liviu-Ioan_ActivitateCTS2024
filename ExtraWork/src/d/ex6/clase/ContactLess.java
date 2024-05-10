package d.ex6.clase;

public class ContactLess extends ADecorator{
    public ContactLess(Platibil card) {
        super(card);
    }

    @Override
    public void plateste() {
        System.out.println("Plata s-a efectuat contactless.");
        super.card.plateste();
    }
}
