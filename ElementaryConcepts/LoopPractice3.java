import java.util.Scanner;
public class LoopPractice3{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	int number = 10;
	int total = 0;
	int largest = 0 ;
	for(int count = 1 ; count <= number ; count++){
		System.out.print("Enter any number");
		int userInput = input.nextInt();
		if(userInput > largest)
			largest = userInput;
		

	}
		System.out.println(largest);
}
}