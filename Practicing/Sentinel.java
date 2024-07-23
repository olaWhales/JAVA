import java.util.Scanner;
public class Sentinel{
public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	int week = 0 ;
	int amount;

		System.out.print("Enter all your expenses throughout the week and press 0 to terminate: ");
	 amount = input.nextInt();

	while(amount != 0){
		week += amount ;

		System.out.print("Enter all your expenses throughout the week and press 0 to terminate: ");
	amount = input.nextInt();

		System.out.println("The total amount is: " + week );
}
		

}


}