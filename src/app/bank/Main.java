package app.bank;

import clients.Account;
import clients.Client;
import clients.CurrentAccount;
import clients.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Client rogerio = new Client();
        rogerio.setName("Rogerio");

        Account account = new CurrentAccount(rogerio);
        account.deposit(500);

        Account savings = new SavingsAccount(rogerio);
        account.transfer(200, savings);

        account.printBankStatement();
        savings.printBankStatement();
    }
}
