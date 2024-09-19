import java.util.Scanner;
public class Palindrome{
	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter possible number: ");
	int number = input.nextInt();

	int first = number ;
	int num = 0 ;

	while(number != 0){
		num = num*10 + number % 10 ;
		number = number / 10 ;
	}
	if (first == num){
		System.out.print("This is a palindrome number: ");
	}else{
		System.out.print("This is not a palindrome ");
	}

	}
}