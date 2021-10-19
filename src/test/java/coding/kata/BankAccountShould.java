package coding.kata;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BankAccountShould {

    private BankAccount bankAccount;

    @Before
    public void setUp() {
        bankAccount = new BankAccount();
    }

    @Test
    public void have_20_euros_in_balance_when_deposit_20_euros() {
        bankAccount.deposit(20);
        assertEquals(bankAccount.getBalance(), 20);
    }

    @Test
    public void have_0_euros_in_balance_when_deposit_then_withdraw_20_euros() {
        bankAccount.deposit(20);
        bankAccount.withdraw(20);
        assertEquals(bankAccount.getBalance(), 0);
    }

    @Test(expected = RuntimeException.class)
    public void throw_exception_when_deposit_20_euros_then_withdraw_40_euros() {
        bankAccount.deposit(20);
        bankAccount.withdraw(40);
    }

    @Test
    public void show_history_of_no_operation() {
        String operationsHistory = bankAccount.getOperationsHistory();
        assertEquals(operationsHistory, "");
    }

    @Test
    public void show_history_of_deposit_40_euros() {
        bankAccount.deposit(40);
        String operationsHistory = bankAccount.getOperationsHistory();
        assertEquals(operationsHistory, "Deposit - 19/10/2021 - 40 - 40\n");
    }

    @Test
    public void show_history_of_deposit_40_euros_then_deposit_10_euros() {
        bankAccount.deposit(40);
        bankAccount.deposit(10);
        String operationsHistory = bankAccount.getOperationsHistory();
        assertEquals(operationsHistory, "Deposit - 19/10/2021 - 40 - 40\nDeposit - 19/10/2021 - 10 - 50\n");
    }

    @Test
    public void show_history_of_deposit_40_euros_then_deposit_10_euros_then_withdraw_30_euros() {
        bankAccount.deposit(40);
        bankAccount.deposit(10);
        bankAccount.withdraw(30);
        String operationsHistory = bankAccount.getOperationsHistory();
        assertEquals(operationsHistory, "Deposit - 19/10/2021 - 40 - 40\nDeposit - 19/10/2021 - 10 - 50\nWithdrawal - 19/10/2021 - 30 - 20\n");
    }
}