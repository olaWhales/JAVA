import java.util.Scanner;
public class LoopPractice4{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);


	int number = 10;
	int smallest = 0;
	int userInput = 0;
	for(int count = 0 ; count < number ; count++){

		System.out.print("Enter number from one-ten: ");
		userInput = input.nextInt();

			if(userInput < smallest)
				smallest = userInput;
		
	}
		System.out.print(smallest);

}


}