import java.util.Scanner;
public class ReadingNumberUntilSpecifiedSum{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the first num: ");
	int number1 = input.nextInt();

	int number = 0 ;
	System.out.print("Enter the second num: ");
	int number2 = input.nextInt();
		number1 += number;
	while(number1 < number){
		

		System.out.println("Number is greater than " + number1 );

	
		System.out.println("Number not equal to: " + number2);

}
	}

}