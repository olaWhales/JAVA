//package Account.TestAccount;
//
//import Account.Bank;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.testng.AssertJUnit;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;
//
//public class BankTest{
//    private Bank bank;
//    @BeforeEach
//    public void setUp(){
//        bank = new Bank();
//    }
////    @AfterEach
////    public void tearDown(){
////        bank.accounts.clear();
////    }
//
//    @Test
//    public void testIfBankCanCreateAccount(){
//        bank.createAccount("firstName", "lastName", "pin");
//        AssertJUnit.assertEquals(1 , bank.getAccountCreation());
//    }
//    @Test
//    public void testIfBankCanDeposit(){
//        Account account = bank.createAccount("firstName", "lastName", "pin");
//        bank.deposit(2000, account.getAccountNumber());
//        assertEquals(2000 , account.getBalance());
//    }
//    @Test
//    public void testIfBankCanNotDepositNegativeAmount(){
//        Account account = bank.createAccount("firstName", "lastName", "pin");
//        bank.deposit(-1000, account.getAccountNumber());
//        AssertJUnit.assertEquals(0 , bank.getBalance(account.getAccountNumber(), "pin"));
//    }
//    @Test
//    public void testIfBankCanWithdraw(){
//        Account account = bank.createAccount("firstName", "lastName", "pin");
//        bank.deposit(4000, account.getAccountNumber());
//        AssertJUnit.assertEquals(4000 , bank.getBalance(account.getAccountNumber(), "pin"));
//        bank.withdraw(2000 , "1", account.getAccountNumber());
//        AssertJUnit.assertEquals(2000 , bank.getBalance(account.getAccountNumber(), "pin"));
//    }
//    @Test
//    public void testIfBankCanNotwithdifferencePin(){
//        Account account = bank.createAccount("firstName", "lastName", "pin");
//        bank.deposit(4000, account.getAccountNumber());
//        AssertJUnit.assertEquals(4000 , bank.getBalance(account.getAccountNumber(), "pin"));
//        bank.withdraw(2000 , "1", account.getAccountNumber());
//        AssertJUnit.assertEquals(2000 , bank.getBalance(account.getAccountNumber(), "pin"));
//        bank.withdraw(2000 , "000", account.getAccountNumber());
//        AssertJUnit.assertEquals(0 , bank.getBalance(account.getAccountNumber(), "pins"));
//    }
//}