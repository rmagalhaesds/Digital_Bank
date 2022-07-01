package clients;

import clients.Client;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printBankStatement() {
        System.out.println("=== Savings clients.Account Statement ===");
        super.printInformation();
    }
}
