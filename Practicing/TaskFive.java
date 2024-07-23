import java.util.Scanner;
public class TaskFive{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int number = 0 ;
			int score = 0 ;
				for(int count = 1 ; count <= 10 ; count++){

				System.out.print("Enter ten scores: ");
				score = input.nextInt();
					if( score % 2 == 0){
					number += score ;

					System.out.println();

					}	
				}
					System.out.print("The sum of the even number collected by the user is: " + number );

	}

}