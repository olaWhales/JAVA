package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    ArrayList<Account>account = new Account<>();
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void testIfAcountRegisterForCustomer() {
        bank.createAccount("olawale", "olaa", "1234");
        bank.createAccount("olawale", "wale", "2222");
        bank.createAccount("grace", "ola", "1111");
        assertEquals(3, bank.countOfAccount());
    }
    @Test
    public void testIfAccountCanDeposit(){
        bank.deposit(5000, 1);
        bank.deposit(2000, 2);
        assertEquals(7000, bank.depositAmount());
    }
    @Test
    public void testIfAccountCanWithdraw(){
        bank.deposit(5000, 1);
        bank.withdraw(1000);
        assertEquals(4000, bank.withdrawerAmount);
    }
}
