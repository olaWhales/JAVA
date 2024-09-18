package ElementConcepts;

import java.util.Scanner;
public class SentinelLargestAndSmall{
	public static void main(String...arg){

	Scanner input = new Scanner(System.in);

	   System.out.print("Enter number: ");
	   int user = input.nextInt();

		int smallest = Integer.MIN_VALUE;
		int largest = Integer.MAX_VALUE;
		while(user > 0){

			if(user > smallest){
			smallest = user;
			smallest++;
			}
			else if (user != 0 || user < largest) {
				largest = user;
				largest++;
			}
		}
			System.out.printf("The largest number is : " + largest + "\nThe smallest number is : " + smallest);
	}
}