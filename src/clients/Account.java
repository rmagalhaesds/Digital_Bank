package clients;

import interfaces.IAccount;

public abstract class Account implements IAccount {

    private static final int PATTERN_BRANCH = 1;
    private static int SEQUENTIAL = 1;

    protected int bankBranches;
    protected int number;
    protected double accountBalance;
    public Client client;

    public Account(Client client) {
        this.bankBranches = Account.PATTERN_BRANCH;
        this.number = SEQUENTIAL++;
        this.client = client;

    }

    @Override
    public void withdraw(double value) {
        accountBalance -= value;
    }

    @Override
    public void deposit(double value) {
        accountBalance += value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }


    public int getBankBranches() {
        return bankBranches;
    }

    public int getNumber() {
        return number;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    protected void printInformation() {
        System.out.println(String.format("Owner %s ", this.client.getName()));
        System.out.println(String.format("com.bank.Bank Branches: %d", this.bankBranches));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("clients.Account Balance: %.2f", this.accountBalance));
    }


}
