package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account= new Account("name","1234",1);
    }
    @Test
    public void testingForbalanceIfItsTrulyZero(){
        int result = account.getBalance();
        assertEquals(0, result);
    }
    @Test
    public void testingForBalanceifDeposit1k(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
    }
    @Test
    public void testingIfAccountCanWithdraw5kwhilehaving2k(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
        account.withdraw(5000);
        assertEquals(2000, account.getBalance());
    }
        @Test
    public void tetsingIfAccountCanWithdraw10kWhileBalanceIs2k(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
        account.withdraw(10_000);
        assertEquals(2000, account.getBalance());
    }
    @Test
    public void testingIfAccountCanWithdraw1KWithBalanceOf1k(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
        account.withdraw(1000);
        assertEquals(1000, account.getBalance());
    }
}



