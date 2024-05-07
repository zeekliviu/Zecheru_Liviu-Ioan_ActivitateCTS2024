package b.ex9.clase;

public class Proxy implements Rezervabil{
    private Rezervabil restaurant;

    public Proxy(Rezervabil restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezerva(Client client) {
        if(client.getNrPersoane() < 4) {
            System.out.println("Clientul " + client.getNume() + " nu poate rezerva o masă deoarece nu are minim 4 persoane.");
        } else {
            restaurant.rezerva(client);
        }
    }
}
