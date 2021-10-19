package coding.kata;

public class Deposit extends Operation {
    public Deposit(int amount, int balance) {
        super(amount, balance);
    }

    @Override
    public String toString() {
        return "Deposit - " + this.date + " - " + this.amount + " - " + this.balance + "\n";
    }
}
