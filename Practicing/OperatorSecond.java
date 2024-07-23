import java.util.Scanner;
public class OperatorSecond{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);

		System.out.print("Enter any number that is divisible by 3 and 5: ");
		int number = input.nextInt();
	
			if(number %3 == 0 & number %5 == 0){
				System.out.print("The number is divisible by 3 and 5");
			}else{
				System.out.print("The number is not divisible:");
			}

	}

}