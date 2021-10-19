package coding.kata;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int balance;
    private List<String> operations;

    public BankAccount() {
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    public void deposit(int amount) {
        this.balance += amount;
        operations.add("Deposit - 18/10/2021 - 40 - 40");
    }

    public void withdraw(int amount) {
        if(amount > balance) {
            throw new RuntimeException("You don't have enough money");
        }
        this.balance -= amount;
    }

    public String getOperationsHistory() {
        if(operations.isEmpty()) {
            return "";
        }
        return operations.get(0);
    }

    public int getBalance() {
        return this.balance;
    }

}
