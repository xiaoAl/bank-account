package coding.kata;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {

    public static final String DD_MM_YYYY = "dd/MM/yyyy";
    protected final int amount;

    protected final int balance;

    protected final String date;

    public Operation(int amount, int balance) {
        this.amount = amount;
        this.balance = balance;
        this.date = this.computeDate();
    }

    public int getAmount() {
        return this.amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getDate() {
        return this.date;
    }

    private String computeDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DD_MM_YYYY);
        return simpleDateFormat.format(new Date());
    }
}
