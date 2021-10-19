package coding.kata;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            throw new RuntimeException("You don't have enough money");
        }
        this.balance -= amount;
    }

    public String getOperationsHistory() {
        return "";
    }

    public int getBalance() {
        return this.balance;
    }

}
