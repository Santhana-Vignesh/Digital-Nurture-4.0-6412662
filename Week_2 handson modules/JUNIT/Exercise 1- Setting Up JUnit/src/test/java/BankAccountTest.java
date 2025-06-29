import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testInitialBalance() {
        BankAccount acc = new BankAccount(1000);
        assertEquals(1000, acc.getBalance());
    }

    @Test
    void testDeposit() {
        BankAccount acc = new BankAccount(500);
        acc.deposit(200);
        assertEquals(700, acc.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount acc = new BankAccount(800);
        boolean success = acc.withdraw(300);
        assertTrue(success);
        assertEquals(500, acc.getBalance());
    }

    @Test
    void testWithdrawFail() {
        BankAccount acc = new BankAccount(100);
        boolean success = acc.withdraw(200);
        assertFalse(success);
        assertEquals(100, acc.getBalance());
    }
}
