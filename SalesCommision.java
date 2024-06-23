import java.util.Scanner;
public class SalesCommision{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your sales amount: ");
	int sales = input.nextInt(); 
	double rate = 9 / 100 ;
	double amount = sales * rate ;
	
	int wages = 200 ;
	double totalWages = amount + wages ;
		System.out.print(totalWages);
	
	
	}

}