import java.util.Scanner;

public class LogisticDispatchRiderClass{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Enter the amount of sales per day:   ");
		int amount = input.nextInt();

		int expectedResult = LogisticFunction.deliveryInput(amount);
		System.out.print(expectedResult);

		

	}

}