import java.util.Scanner;
public class HighestAndLowest{
public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter five digit: ");
	int number = sc.nextInt();


	int number1 = number % 10 // 10000;
	int number2 = number % 10 // 10000;
	int number3 = number % 10 // 100;
	int number4 = number % 10 // 10;
	int number5 = number % 10 // 1;

	if (number1 == number5 && number2 == number4)
		System.out.print("its a palindrome");
	else
		System.out.print("not a palindrome");


}
}