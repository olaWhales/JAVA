import java.util.Scanner;
public class Account{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);

	System.out.print("WELCOME TO @Whales BANKING OF NIGERIA");

	System.out.print("Enter your name to access the Main Menu: ");
	String name = input.nextLine();

	System.out.print("""				
			1. Create Account
			2. Deposit 
			3. Withdraw
			4. Transfer
			5. Check Balance
			6. Find Account
			""");
	int access = input.nextInt();
	
		//switch access(){

		//	case 1: 
		/*		"CreateAccount";
				break;
			case 2:
				"Deposit"
				break;
			case 3:
				"Withdraw";
				break;
			case 4:
				"Transfer";
				break;
			default;
				
				System.out.print();


				}

	**/







/*	}
	public static String CreateAccount(){
		String createAccount = 
			"""
			1. Create Account
			2. Deposit 
			3. Withdraw
			4. Transfer
			5. Check Balance
			6. Find Account
			"""
	}
	
	public static String Deposit(){
			"""
			1. Name
			2. Phone_No
			3. Pin
			"""
	}
	
	public static String Withdrawer(){
	String withdraw = 
			"""
			1. Pin
			2. Account
			3. Amount
			"""
	}
	
	public static String Transfer(){
	String transfer = 	
			"""
			1. Sender Account
			2. Receiver Account
			3. Sender Name
			4. Amount
			5. Sender Pin
			"""
	//}
	
	//public  Static String Transfer(){
	//String findAccount = 
	//}**/
}
}