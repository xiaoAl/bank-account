package coding.kata;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public static final String NOT_ENOUGH_MONEY_EXCEPTION = "You don't have enough money";
    private int balance;
    private List<Operation> operations;

    public BankAccount() {
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    public void deposit(int amount) {
        this.balance += amount;
        this.operations.add(new Deposit(amount, balance));
    }

    public void withdraw(int amount) {
        if (amount > this.balance) {
            throw new RuntimeException(NOT_ENOUGH_MONEY_EXCEPTION);
        }
        this.balance -= amount;
        this.operations.add(new Withdrawal(amount, balance));
    }

    public String getOperationsHistory() {
        StringBuilder operationHistory = new StringBuilder("");
        this.operations.stream().forEach(operation -> operationHistory.append(operation.toString()));
        return operationHistory.toString();
    }

    public int getBalance() {
        return this.balance;
    }

}
