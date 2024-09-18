//package gateOne.Java_PROJECT.src.Account;
//
//import bank.Account;
//import bank.Bank;
//
//import java.util.Scanner;
//
//import static Account.Main.bank;
//import static gateOne.Java_PROJECT.src.Account.Main.bank;
//
//public class Main {
//    static Scanner sc = new Scanner(System.in);
//    static Bank bank = new Bank();
//
//
//    public static void menu(){
//        System.out.println("""
//                1.  Create Account
//                2.  Deposit Money
//                3.  Withdraw Money
//                4.  Check Balance
//                5.  Transfer Money
//                6.  exit
//
//                """);
//        String menuList = sc.nextLine();
//        switch(menuList) {
//            case "1" -> createAccount();
//            case "2" -> deposit();
//            case "3" -> withdrawal();
//            case "4" -> checkBalance();
//            case "5" -> transfer();
//            case "6" -> exit();
//            default -> menu();
//
//        }
//    }
//
//    private static void exit() {
//        System.out.println("Thank you for using our Bank application");
//    }
//
//    private static void transfer() {
//
//    }
//
//    private static void checkBalance() {
//        String number = input("Enter your account number: ");
//        String pin = input("Enter your pin: ");
//        String message =bank.checkBalance(number, pin);
//        System.out.println(message);
//        menu();
//    }
//
//    private static void deposit() {
//        String accountNumber = input("Enter account number: ");
//        double amount = Double.parseDouble(input("Enter amount: "));
//        bank.deposit(accountNumber, amount);
//        System.out.println("Deposited " + amount + " to " + accountNumber);
//        menu();
//    }
//
//    private static void withdrawal() {
//
//    }
//
//    public static void createAccount() {
//        String name = input("Enter your Name: ");
//        String pin = input("Enter your pin: ");
//        System.out.println("\n Account created successfully!!! \n ");
//        Account createdAccount = bank.createAccount(name,pin);
//        System.out.println(createdAccount);
//        menu();
//    }
//
//    private static String input(String userInput){
//        System.out.print(userInput);
//        return sc.nextLine();
//    }
//
//
//
//    public static void main(String[] args) {
//        menu();
//
//    }
//}