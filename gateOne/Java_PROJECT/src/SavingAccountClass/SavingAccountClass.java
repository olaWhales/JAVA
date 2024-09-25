package SavingAccountClass;
import java.util.ArrayList;

public class SavingAccountClass {
    private String name;
    private String pinNumber;
    private int balance = 0;
    private String accountNumber = "0";

    public SavingAccountClass(String name, String pin, String accountNumber) {
        this.name = name;
        this.pinNumber = pin;
        this.accountNumber = accountNumber;
    }
    public static ArrayList<SavingAccountClass> accountList = new ArrayList<SavingAccountClass>();

    public static void createAccount(String name, String pin) {
        String accountNumber = accountNumberGenerator();
        SavingAccountClass savingAccountClass = new SavingAccountClass("name", "pin", accountNumber);
        accountList.add(savingAccountClass);
    }
    public int accountSize() {
        return accountList.size();
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    private static String accountNumberGenerator() {
        int totalNumberOfAcountNumber = accountList.size()+1 ;
        return "222333444" + totalNumberOfAcountNumber;
    }
        private SavingAccountClass validateAccountNumber(String accountNumber) {
        for(SavingAccountClass savingAccountClass : accountList) {
            if(savingAccountClass.accountNumber.equals(accountNumber)) {
                return savingAccountClass;
            }
        }
        return null;
    }
    public void deposit(String accountNumber, int amount) {
        validateAccountNumber(accountNumber);
        if (accountNumber.equals(accountNumber)) {
            this.balance += amount;
        } else {
            System.out.println("Invalid account number");
        }
    }
    public int getBalance(String pinNumber) {
        if (pinNumber.equals(this.pinNumber)) {
            return (int) this.balance;
        }
        throw new RuntimeException("invalid pin");
    }
    public void calculateInterest(int rate){
         double totalRate = (double) rate /100;
         double interest = this.balance * totalRate;
         this.balance += interest;
         //System.out.println("Balance after interest calculation: " + (this.balance));

    }

}