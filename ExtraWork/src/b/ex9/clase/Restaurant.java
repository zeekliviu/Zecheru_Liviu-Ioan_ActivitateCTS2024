package b.ex9.clase;

public class Restaurant implements Rezervabil{

    @Override
    public void rezerva(Client client) {
        System.out.printf("Clientul %s a rezervat o masă pentru %d persoane.%n", client.getNume(), client.getNrPersoane());
    }
}
