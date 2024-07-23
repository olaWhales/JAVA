import java.util.Scanner;
public class ExerciseOnSquare{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
	
	int count ;
	int number  = 0;
	System.out.print("Enter number: ");
	number = input.nextInt();
	for(count = 1 ; count <= number ; count++){
		if(count * count == number){
			System.out.print("It's a square of the number.");
		}
	}


}

}