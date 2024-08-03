import java.util.Scanner;
public class Palindrome{
	public static void main(String [] args ){

	Scanner input = new Scanner(System.in);
	

	System.out.print("Enter a number and check if it's correct: ");
	int number = input.nextInt();

	int pal = number ;
	int num = 0 ;
	
	while(number != 0){
	  num = num *10 + number%10 ;
	  number = number / 10 ;
	}
	  if(pal == num){
	    System.out.print("The number is palindrome.");
	}
	 else{
	    System.out.print("Not a palindrome.");
	}

}
}