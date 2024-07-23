import java.util.Scanner;
public class TaskFour{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int number = 0 ;
			int score = 0 ;
				for(int count = 1 ; count <= 10 ; count++){

				System.out.print("Enter ten scores: ");
				score = input.nextInt();
					if( count % 2 == 0){

					number += count ;
					System.out.println(number);

					}	
				}
					System.out.print("The sum of the even indexes is: " + number );

	}

}