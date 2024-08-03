import java.util.Scanner;

public class Multiples{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		System.out.print(" Enter first number : ");
		int firstNumber = input.nextInt();

		System.out.print(" Enter second number : ");
		int secondNumber = input.nextInt();

			int tripple = firstNumber + firstNumber + firstNumber ;
			int doubleNumber = secondNumber + secondNumber ;

		if(doubleNumber % tripple == 0){
			System.out.print( doubleNumber + " Yes it's multiples of the first number ");
		}else{
			System.out.print("It's not multiples");
		}
	}

}