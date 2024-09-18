import java.util.Scanner;
public class TaskEight{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int number = 0 ;
			int score = 0 ;
				for(int count = 1 ; count <= 10 ; count++){

				System.out.print("Enter ten scores between 1 to 100 to see your result: ");
				score = input.nextInt();


				if(score >= 100) System.out.print("Enter number between 1 to 100");

				if(score <= 100)

					number += score ;

					System.out.println();
					}

					System.out.print("The average of five task is: " + number);


	}
}
