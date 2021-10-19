package coding.kata;

public class Withdrawal extends Operation {
    public Withdrawal(int amount, int balance) {
        super(amount, balance);
    }

    @Override
    public String toString() {
        return "Withdrawal - " + this.date + " - " + this.amount + " - " + this.balance + "\n";
    }
}
