package coding.kata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BankAccountShould {

    @Test
    public void deposit_20_euros_when_deposit_20_euros() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20);
        assertEquals(bankAccount.getBalance(), 20);
    }
}