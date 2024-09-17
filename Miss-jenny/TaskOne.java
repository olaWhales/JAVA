import java.util.Scanner;
public class TaskOne{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int number = 0 ;
			int score = 0 ;
				for(int count = 1 ; count <= 10 ; count++){

				System.out.print("Enter ten scores: ");
				score = input.nextInt();

					number += count ;
					System.out.println();


				}
					System.out.print("The total score is: " + number);

	}

}