import java.util.Scanner;
public class prime{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the integer number: ");
	int number = input.nextInt();
	
	if(number %2 == 1 && number %3 == 2){
		System.out.print("The number input by the user is a prime numbers.");
	}else{
		System.out.print("The number entered isn't prime numbers. ");
	}


}

}

