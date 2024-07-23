import java.util.Scanner;
public class TaskSix{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int number = 0 ;
			int score = 0 ;
				for(int count = 1 ; count <= 5 ; count++){

				System.out.print("Enter ten scores: ");
				score = input.nextInt();
					number += score ;

					System.out.println();
	
				}
					System.out.print("The average of five task is: " + number / 2);

	}

}