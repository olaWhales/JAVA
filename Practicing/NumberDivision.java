import java.util.Scanner;

public class NumberDivision{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.print(" Enter any number : ");
		int number = input.nextInt();

	

		if (number % 3 == 0) { 
		System.out.print(number + " this is divisible by 3 ");
		}
		else{
		System.out.print(number + " this number isn't divisible by 3 ");
}



	}

}