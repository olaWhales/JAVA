import java.util.Scanner;
public class TaskNine{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int number = 0 ;
			int score = 0 ;
				for(int count = 1 ; count <= 10 ; count++){

				System.out.print("Enter ten valid score: ");
				score = input.nextInt();
					number += score ;
					System.out.println();
					}

					System.out.print("The sum of valid number is: " + number);


	}
}
