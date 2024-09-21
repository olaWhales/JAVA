package SavingAccountClassTest;

import SavingAccountClass.SavingAccountClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingAccountClassTest {
    private SavingAccountClass savingAccountClass;
    @BeforeEach
    public void setUp() {
        savingAccountClass = new SavingAccountClass("Ajadi_taoreed" , "1111" , "2223334441");
        //savingAccountClass = new SavingAccountClass("Ajadi_olawale" , "1112" , "2223334442");

    }
    @Test
    public void testIfSavingAccountClassExists() {
    }
    @Test
    public void testIfSavingAccountClassCanCreateAccount() {
        savingAccountClass.createAccount("olawale","1111");
        savingAccountClass.createAccount("ishola" , "1112" );
        Assertions.assertEquals(savingAccountClass.accountSize(), 2);
        System.out.println(savingAccountClass.accountSize());
    }
    @Test
    public void testIfSavingAccountClassCanDeposit() {
        savingAccountClass.deposit("2223334441" , 2000);
        Assertions.assertEquals(savingAccountClass.getBalance("1111"), 2000);
    }
    @Test
    public void testIfSavingAccountClassCanDepossitMoreThanOnce() {
        savingAccountClass.deposit("2223334441" , 2000);
        savingAccountClass.deposit("2223334441" , 2000);
        Assertions.assertEquals(savingAccountClass.getBalance("1111"), 4000);
    }
    @Test
    public void testIfSavingAccountClassCanDepositMoreTwoAccounts() {
        savingAccountClass.deposit("2223334441" , 2000);
        savingAccountClass.deposit("2223334442" , 2000);

        Assertions.assertEquals(2000,savingAccountClass.getBalance("1111"));
        System.out.println(savingAccountClass.getBalance("1111"));

        Assertions.assertEquals(2000, savingAccountClass.getBalance("1112"));
        System.out.println(savingAccountClass.getBalance("1112"));
    }
}
