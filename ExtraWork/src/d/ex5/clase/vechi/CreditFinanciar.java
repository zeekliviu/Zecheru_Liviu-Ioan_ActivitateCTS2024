package d.ex5.clase.vechi;

import d.ex5.clase.client.Client;

public class CreditFinanciar implements Creditabil{
    private Client client;

    public CreditFinanciar(Client client) {
        this.client = client;
    }

    @Override
    public void acordaCredit() {
        System.out.printf("Clientul %s %s primi un credit financiar.%n", client.getNume(), client.isRauPlatnic() ? "nu poate" : "poate");
    }

    public Client getClient() {
        return client;
    }
}
