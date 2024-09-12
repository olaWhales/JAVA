package Account.TestAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest{
    @BeforeEach
    public void setUp(){
        Account account = new Account("firstName", "lastName", "pin", "1");
    }

    @Test
    public void testAccountCanDeposit(){
        Account account = new Account("firstName", "lastName", "pin","1");
        account.deposit(2000, account.getAccountNumber());
        assertEquals(2000 , account.getBalance());
    }

    @Test
    public void testAccountCanWithdraw(){
        Account account = new Account("firstName", "lastName", "pin", "1");
        account.deposit(1000, account.getAccountNumber());
        account.withdraw(1000);
        assertEquals(0 , account.getBalance());
    }
    @Test
    public void testAccountCanCheckBalance(){
        Account account = new Account("firstName", "lastName", "pin" , "1");
        account.deposit(2000, account.getAccountNumber());
        account.withdraw(1000);
        assertEquals(1000 , account.getBalance());
    }

}