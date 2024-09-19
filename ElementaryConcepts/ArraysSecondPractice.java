import java.util.Arrays;
import java.util.Scanner;
public class ArraysSecondPractice{
public static void main(String...args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number size:  ");
	int num = input.nextInt();
	int [] numbers = {num};

	int sum = 0;
	int multiplication = 1;
	int minimum = numbers[0];
	int maximum = numbers[0];
	
	System.out.print("Enter number" + num + "size:  ");

	for(int count = 0 ; count < numbers.length ; count++){
	

	if(numbers[count] < minimum)
		maximum = numbers[count];
	if(maximum == 0 && numbers[count] < maximum)
		minimum = numbers[count];
	numbers[count]= count+1;
	sum= sum+numbers[count];
	multiplication = multiplication*numbers[count];
	
	 
}
	System.out.println(Arrays.toString(numbers));
	System.out.println("The total number is: "+ sum);
	System.out.println("The multiples of the numbers is :" + multiplication);
	System.out.println("The maximum number is : " + minimum);
	System.out.print("The minimum numbers is : "+ maximum);


}

}