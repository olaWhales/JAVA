//package Account;
//
//import bank.exceptions.AccountNumberNotFoundException;
//import java.util.ArrayList;
//
//public class Bank {
//    private ArrayList<Account> accounts = new ArrayList<>();
//    private int totalNumberOfAccount;
//
//
//    public Account createAccount(String accountName, String accountPin) {
//        String accountNumber = accountNUmberGenerator();
//        Account account = new Account(accountName, accountNumber, accountPin);
//        accounts.add(account);
//        return account;
//    }
//
//    public String checkBalance(String accountNumber, String accountPin) {
//        Account  number = accountNumberValidator(accountNumber);
//        if (number!=null && number.getPin().equals(accountPin)) {
//            return "The Account "+number.getName()+ " Has a balance of  "+number.getBalance(accountPin);
//        }
//        else throw new AccountNumberNotFoundException("Account number "+accountNumber+" does not exist");
//    }
//
//
//    private String accountNUmberGenerator() {
//        totalNumberOfAccount+=1;
//        return"222333444"+totalNumberOfAccount;
//    }
//
//    private Account accountNumberValidator(String accountNumber) {
//        for (Account account : accounts) {
//            if (account.getNumber().equals(accountNumber)) {
//                return account;
//            }
//        }
//        return null;
//    }
//
//    public void deposit(String accountNumber, double amount) {
//        Account foundAccountNumber = accountNumberValidator(accountNumber);
//        if (foundAccountNumber!=null && amount>0) {
//            foundAccountNumber.deposit(amount);
//        }
//        else throw new AccountNumberNotFoundException(" Account number not found");
//    }
//    public void withdrawal(String accountNumber,String pin, double amount) {
//        Account foundAccountNumber = accountNumberValidator(accountNumber);
//        if (foundAccountNumber!=null && foundAccountNumber.getBalance(pin)>amount) {
//            foundAccountNumber.withdraw(amount,pin);
//        }
//        else throw new AccountNumberNotFoundException(" Account number not found");
//    }
//
//    public void transfer(String sendersAccount, String receiversAccount, double amount,String pin) {
//        withdrawal(sendersAccount,pin,amount);
//        deposit(receiversAccount,amount);
//
//    }
//
//    public int getTotalNumberOfAccount(){
//        return totalNumberOfAccount;
//    }
//
//
//
//}
