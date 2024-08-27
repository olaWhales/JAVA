package account;

public class Account {
    private int balance ;
    private String name ;
    private String pin ;
    private int accountNo ;

    public Account(String name , String pin , int accountNo ){
        this.name = name ;
        this.pin = pin ;
        this.accountNo = accountNo ;
    }
    public void CreateAccount(String firstName , String pin ,int accountNo) {
    }
    public String createAccount(){
        return name ;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public int getBalance(){
        if(balance > 0 )
            return balance ;
        return 0 ;
    }
    public void withdraw(int amount){
        if(balance >= amount) balance = balance - amount ;
    }

}
