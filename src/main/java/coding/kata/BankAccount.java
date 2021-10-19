package coding.kata;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
    public static final String NOT_ENOUGH_MONEY_EXCEPTION = "You don't have enough money";
    private int balance;
    private List<String> operations;

    public BankAccount() {
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    public void deposit(int amount) {
        this.balance += amount;
        this.operations.add("Deposit - " + getOperationDate() + " - " + amount + " - " + this.balance);
    }

    private String getOperationDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(new Date());
    }

    public void withdraw(int amount) {
        if(amount > this.balance) {
            throw new RuntimeException(NOT_ENOUGH_MONEY_EXCEPTION);
        }
        this.balance -= amount;
    }

    public String getOperationsHistory() {
        if(this.operations.isEmpty()) {
            return "";
        }
        return this.operations.stream().map(operation -> operation + "\n").collect(Collectors.joining(""));
    }

    public int getBalance() {
        return this.balance;
    }

}
