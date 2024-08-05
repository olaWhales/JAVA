import java.util.Scanner;
public class CheckOutApp{
	public static void main(String...args){
	   Scanner input = new Scanner(System.in);


		int total = 0 ;
		int customer = 0;
		boolean user = true;
		int sum = 0;

		System.out.print("whats the customer's Names: ");
		String customerName = input.nextLine();

	do{
		System.out.print("whats did the user buy? ");
		String item = input.nextLine();

		System.out.print("How many pieces? ");
		int quantity = input.nextInt();

		System.out.print("How much per Unit: ");
		int price = input.nextInt();
		sum += price ;
		
		System.out.print("How much discount will he got? ");
		int discount = input.nextInt();


		System.out.println("Continue (yes/no)");
		String attempt = input.nextLine();
		user = attempt.equalsIgnoreCase("yes");
	}
	while(user);
		System.out.println("Thanks for your patronage!!!");

		input.close();
		System.out.println("==============================================================");
		System.out.printf("%s\n%s\n%s\n%s\n%s\n%s","SEMICOLON", "MAIN BRANCH", "LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.","TEL: 08102790000","Date: 5th of August 2024","Cashier: Cashier's Name");
		System.out.println("Customer Name: " + customerName );
		System.out.println("==============================================================");
	System.out.println("		ITEM	QTY	PRICE	TOTAL(NGN)");
	System.out.println("--------------------------------------------------------------");
	System.out.print(item);
	//System.out.printf("%4d%4d%4d", quantity, price, sum);
	
	
	
	}
}