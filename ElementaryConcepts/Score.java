import java.util.Scanner;
public class Score{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);


	int totalStudent = 10 ;

	System.out.print("Enter score 1: ");
	int score1 = input.nextInt();

	System.out.print("Enter score 2: ");
	int score2 = input.nextInt();

	System.out.print("Enter score 3: ");
	int score3 = input.nextInt();

	System.out.print("Enter score 4: ");
	int score4 = input.nextInt();

	System.out.print("Enter score 5: ");
	int score5 = input.nextInt();

	System.out.print("Enter score 6: ");
	int score6 = input.nextInt();

	System.out.print("Enter score 7: ");
	int score7 = input.nextInt();

	System.out.print("Enter score 8: ");
	int score8 = input.nextInt();

	System.out.print("Enter score 9: ");
	int score9 = input.nextInt();

	System.out.print("Enter score 10: ");
	int score10 = input.nextInt();

		int total = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 ;

		int average = total / totalStudent ;

		System.out.println("The total score is " + total);
		System.out.println("The average score is " + average);

} 
}