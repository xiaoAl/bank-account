package coding.kata;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
