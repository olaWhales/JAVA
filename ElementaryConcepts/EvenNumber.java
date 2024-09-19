import java.util.Scanner;
public class EvenNumber{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	int number = 0 ;
	int counter = 10 ;
	int numbers = 0 ;
	 

	for(int count = 1 ; count<= counter ; count++){
		System.out.print("Enter number: ");
		number = input.nextInt();
			if(number %2 == 0) 
				System.out.println("This is even number: " + number);

	}
}

}