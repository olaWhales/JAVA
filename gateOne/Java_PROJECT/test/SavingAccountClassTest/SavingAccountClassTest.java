package SavingAccountClassTest;

import SavingAccountClass.SavingAccountClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SavingAccountClassTest {


    @Test
    public void testIfSavingAccountClassCanCreateAccount() {
        SavingAccountClass savingAccountClass = new SavingAccountClass("olawale", "1111", "2223334441");
        SavingAccountClass.createAccount("olawale","1111" );
        SavingAccountClass.createAccount("ishola" , "1112" );
        Assertions.assertEquals(savingAccountClass.accountList.size(), 2);
    }
    @Test
    public void testIfSavingAccountClassCanDeposit() {
        SavingAccountClass savingAccountClass = new SavingAccountClass("ishola_olawale" , "1112" ,"2223334441");
        savingAccountClass.deposit("2223334442" , 2000);
        Assertions.assertEquals(savingAccountClass.getBalance("1112"), 2000);
    }
    @Test
    public void testIfSavingAccountClassCanDepossitMoreThanOnce() {
        SavingAccountClass saver1 = new SavingAccountClass("ishola" , "1111" , "2223334441");
        saver1.deposit("2223334441" , 4000);
        Assertions.assertEquals(saver1.getBalance("1111"), 4000);
        SavingAccountClass saver2 = new SavingAccountClass("olawale" , "1112" ,"2223334442");
        saver2.deposit("2223334442" , 4000);
        Assertions.assertEquals(saver2.getBalance("1112"), 4000);
    }
    @Test
    public void testIfSavingAccountClassCanCalculateyearlyInterest() {
        SavingAccountClass savingAccountClass = new SavingAccountClass("ishola" , "1112" , "2223334441");
        savingAccountClass.deposit("2223334441" , 2000);
        Assertions.assertEquals(savingAccountClass.getBalance("1112"), 2000);
        savingAccountClass.calculateInterest(4);
        assertEquals(savingAccountClass.getBalance("1112"), 2080);
    }
}
