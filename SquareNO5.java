import java.util.Scanner;
public class SquareNO5{
	public static void main(String...args){

		Scanner input = new Scanner(System.in);

		int square = 1;

		System.out.print("Enter two number: ");	
		int user = input.nextInt();

		System.out.print("Enter two number: ");	
		int user2 = input.nextInt();

		for(int count = 1 ; count <= user ; count++){
		square *= user2;
		
		}
			System.out.print("The square root of the user input is " + square);

	}
}
