import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BankAccountTest {
    @Test
    public void testDepositWithPositiveAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        account.deposit(50);
        Assertions.assertEquals(150, account.getBalance());
    }

    @Test
    public void testDepositWithNegativeAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-50);
        });
    }

    @Test
    public void testWithdrawWithPositiveAmountAndSufficientBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        account.withdraw(50);
        Assertions.assertEquals(50, account.getBalance());
    }

    @Test
    public void testWithdrawWithNegativeAmount() {
        BankAccount account = new BankAccount(100, 0.05);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-50);
        });
    }

    @Test
    public void testWithdrawWithInsufficientBalance() {
        BankAccount account = new BankAccount(100, 0.05);
        Assertions.assertThrows(IllegalStateException.class, () -> {
            account.withdraw(150);
        });
    }

    @Test
    public void testTransferWithPositiveAmountAndSufficientBalance() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        account1.transfer(50, account2);
        Assertions.assertEquals(50, account1.getBalance());
        Assertions.assertEquals(250, account2.getBalance());
    }

    @Test
    public void testTransferWithNegativeAmount() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account1.transfer(-50, account2);
        });
    }
    @Test
    public void testTransferWithInsufficientBalance() {
        BankAccount account1 = new BankAccount(100, 0.05);
        BankAccount account2 = new BankAccount(200, 0.05);
        Assertions.assertThrows(IllegalStateException.class, () -> {
            account1.transfer(150, account2);
        });
    }

    @Test
    public void testTransferWithNullAccount() {
        BankAccount account1 = new BankAccount(100, 0.05);
        Assertions.assertThrows(NullPointerException.class, () -> {
            account1.transfer(50, null);
        });
    }

    @Test
    public void testAddInterest() {
        BankAccount account = new BankAccount(100, 0.05);
        account.addInterest();
        Assertions.assertEquals(105, account.getBalance());
    }
}
