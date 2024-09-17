import java.util.Scanner;
public class ExerciseOnOddBreak{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);

			int tobreak = 0 ;
			int number = 0 ;
			
				for(int count = 1 ; count <= 10 ; count++){

					System.out.print("Enter 10 numbers: ");
					number = input.nextInt();

					if(count == 7){
						break;
					}

		}
				System.out.print(number);


	}

}