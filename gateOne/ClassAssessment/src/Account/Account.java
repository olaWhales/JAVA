//package Account;
//
//public class Account {
//    private int balance;
//    private String name;
//    private String pin;
//    private String accountNumber ;
//
//    public Account(String firstName, String lastName, String pin, String accountNumber) {
//        name = firstName + " " + lastName;
//        this.pin = pin;
//        this.balance = 0;
//        this.accountNumber = accountNumber;
//    }
//
//
//    public void deposit(int amount, String number) {
//        if (amount > 0) {
//            this.balance += amount;
//        }
//    }
//    public int getBalance() {
//        return balance;
//    }
//
//    public void withdraw(int amount) {
//            this.balance -= amount;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setBalance(int amount) {
//        this.balance += amount;
//    }
//
//    public String getPin() {
//        return pin;
//    }
//}