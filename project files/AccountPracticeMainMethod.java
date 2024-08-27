import java.util.Scanner;
public class AccountPracticeMainMethod{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);

		AccountPractice myAccount = new AccountPractice();

		System.out.print("Enter your name ");
		String theName = input.nextLine();
		myAccount.setName(theName);

		System.out.print(myAccount.getName());

		

	}
}