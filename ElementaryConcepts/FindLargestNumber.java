import java.util.Scanner;
public class FindLargestNumber{
public static void main(String[]args){

	Scanner input = new Scanner(System.in);

		int largest = 0 ;
		System.out.print("Enter 10 integers: ");
		int user_input = input.nextInt();

		for(int number = 0 ; number <= user_input ; number++ ){
			if(number > largest){
				largest = number ;
			}
			System.out.print(number + " ");
		}
	}
}