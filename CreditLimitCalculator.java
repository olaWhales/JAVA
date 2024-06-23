import java.util.Scanner;
public class CreditLimitCalculator{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);

	System.out.print("Enter the balance: ");	
	int beginingBalance = input.nextInt();

	System.out.print("Enter the amount charge per month: ");	
	int amountCharge = input.nextInt();

	System.out.print("Enter the amount of credit applied : ");	
	int creditApplied = input.nextInt();

	System.out.print("Enter the amount of credit limit : ");	
	int creditLimit = input.nextInt();

	int newBalance = beginingBalance + amountCharge - creditApplied ;

	if( beginingBalance > creditApplied ){
		System.out.print("You're eligible");
	}else
	{
		System.out.print("You're not eligible");
	}


	}
}