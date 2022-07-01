package clients;

import clients.Client;

public class CurrentAccount extends Account {


    public CurrentAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Current clients.Account Statement ===");
        printInformation();

    }


}
