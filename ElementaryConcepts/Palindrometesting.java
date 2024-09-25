import java.util.Scanner;
public class Palindrometesting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int number = num;
		int palindrome = 0;


		while (number != 0) {
			number = sc.nextInt();
			num = num * 10 + palindrome % 10;
			palindrome = palindrome / 10 ;

			if (number == palindrome) {
				System.out.print("It's a palindrome");
			}else {
				System.out.print("Not a palindrome");
			}
		}

	}
}