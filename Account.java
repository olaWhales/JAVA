import java.util.ArrayList;
import java.util.Scanner;
public class Account{
	public static void main(String...args){

	ArrayList <String> stringlist = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO @Whales BANKING OF NIGERIA");
	System.out.println();
	System.out.print("Enter your name to access the Main Menu: ");
	String name = input.nextLine();

	System.out.print("""
			<<<< SELECT ANY OF THE OPTION BY PRESING THE NUMBER TO PERFORM YOUR TASK >>>> 				
			1. Create account
			2. Deposit
			3. Withdraw
			4. Transfer
			5. Check Balance
			6. Change pin
			""");
	int access = input.nextInt();
	
		switch (access){

			case 1:
				register();
				System.out.print("""
					You're to provide this details for form registration.
					1. FirstName
					2. LastName
					3. Pin
					""");
				System.out.println("Enter the first name: ");
				System.out.println("Enter the last name: ");
				System.out.println("Enter pin");
				
				break;		
			case 2:
				deposit();
				System.out.print("""
					You're to provide the following to make your deposit
					1. Name
					2. pin
					""");
				System.out.print("Enter your fullName: ");
				System.out.print("You're welocome \n How much do you want to deposit? ");
					
				break;
			case 3:
				withdrawer();
				System.out.print("""
					For you to withdraw, you need to provide the following details.");
					1. Pin
					2. Account number
					3. Amount
					""");
				System.out.print("Enter your full name");
				System.out.print("Enter your account number");
				System.out.print("Enter the amount to withdraw");



				break;
			case 4:
				transfer();
				break;


			default:
				}
	

}
	public static void register(){
		ArrayList <String> stringlist = new ArrayList<>();
		Scanner input = new Scanner(System.in);
			
				String first = input.next();
				stringlist.add(first);
				String last = input.next();
				stringlist.add(last);
				String pin = input.next(); 
				stringlist.add(pin);
			for(String userReg : stringlist){}
			System.out.print(stringlist);			
	} 
	
	public static void deposit(){
		ArrayList <String> stringlist = new ArrayList<>();
		Scanner input = new Scanner(System.in);

				String fullName = input.next();
				stringlist.add(fullName);
				String userDeposit = input.next();
				stringlist.add(userDeposit);
			for(String userDepo : stringlist){}
			System.out.println(stringlist);
			
	}
	
	public static void withdrawer(){
		ArrayList <String> stringlist = new ArrayList<>();
		Scanner input = new Scanner(System.in);
			
				String fullname = input.next();
				stringlist.add(fullname);
				String accountNumber = input.next();
				stringlist.add(accountNumber);
				String withdraw = input.next();
				stringlist.add(withdraw);
			for(String userWithdrawer : stringlist){}
			System.out.print(stringlist);
	}
	public static void transfer(){
		System.out.print("""
			1. Sender Account
			2. Receiver Account
			3. Sender Name
			4. Amount
			5. Sender Pin
			""");
		}
	
}
