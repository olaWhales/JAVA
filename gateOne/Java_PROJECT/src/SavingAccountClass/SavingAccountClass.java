package SavingAccountClass;
import java.util.ArrayList;
import java.util.Objects;

public class SavingAccountClass {
    private String name ;
    private String pinNumber ;
    private int balance = 0;
    private String accountNumber = "0";

    public SavingAccountClass(String name, String pin, String accountNumber) {
        this.name = name;
        this.pinNumber = pin;
        this.accountNumber = accountNumber;
    }
    ArrayList<SavingAccountClass> accountList = new ArrayList<SavingAccountClass>();

    public SavingAccountClass createAccount(String name, String pinNumber ) {
        String accountNumber = accountNUmberGenerator();
        SavingAccountClass savingAccountClass = new SavingAccountClass("name" , "pin" , accountNumber);
        accountList.add(savingAccountClass);
        return savingAccountClass;
    }
    public Object accountSize(){
        return accountList.size();
    }
    private String accountNUmberGenerator() {
        int totalNumberOfAcountNumber = 1;
        return "222333444" + totalNumberOfAcountNumber;
    }
    private String validateAccountNumber(String accountNumber) {
        for(SavingAccountClass savingAccountClass : accountList) {
            if(savingAccountClass.accountNumber.equals(accountNumber)) {
                return savingAccountClass.toString();
            }
        }
        return null;
    }
    public void deposit(String accountNumber , int amount) {
        if (validateAccountNumber(this.accountNumber).equals(accountNumber)) {
            balance += amount;
        }
        else {
            System.out.println("Invalid account number");
        }
    }
    public int getBalance(String pinNumber) {
        if (this.pinNumber.equals(pinNumber) && this.accountNumber.equals(accountNumber)) {
            return balance;
            }
            return 0;
        }
}