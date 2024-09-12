package Account;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList();
    private int numberOfAccounts;
    private String accountNumber = "0" ;
    private Account.Account getAccountNumber;


    public Account createAccount(String firstName, String lastName, String pin) {
        Account account = new Account(firstName, lastName, pin, accountNumber+1 );
        account.setAccountNumber(String.valueOf(numberOfAccounts+1));
        numberOfAccounts++;
        this.accounts.add(account);
        return account;
    }
    public void pinValidation(String accountPin, String myPin) {
        if(accountPin.equals(myPin)){
            System.out.println("Invalid pin");
        }
    }
    public Account validateAccountNumber(String accountNumber) {
        findAccount(accountNumber);
        if(accountNumber.equals(this.accountNumber)){
            return this.getAccountNumber;
        }
        else{
            return null;
        }
    }



    public int getAccountCreation() {
        return this.accounts.size();
    }

    public void deposit(int amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        if (amount > 0) {
            account.setBalance(amount);
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public void withdraw(int amount ,String myPin, String accountNumber) {
        Account account = findAccount(accountNumber);
        pinValidation(account.getPin(), myPin);
        if (account.getBalance() >= amount){
            account.withdraw(amount);
        }
    }
    public double getBalance(String accountNumber , String myPin) {
        Account account = findAccount(accountNumber);
        pinValidation(account.getPin(), myPin);
        return account.getBalance();
    }

}

