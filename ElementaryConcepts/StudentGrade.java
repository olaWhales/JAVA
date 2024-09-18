import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade{
	public static void main(String...args){
	   Scanner input = new Scanner(System.in);

	     int subjectOneTotal = 0 ;
	     int firstStudent = 3 ;
	     String firstStudentScore = "";
	     float firstStudentOneAverage = 0;
	     int highestScore = 0;
	     int lowestScore = 0;


	     System.out.println("How many student do you have? ");
	     int firstStudentNumber = input.nextInt();

	   	     System.out.print("Enter score for student 1 between (1 - 100):  ");
		for(int count = 0 ; count < firstStudent ; count++ ){
			int studentNoOnetudent = input.nextInt();
			if (studentNoOnetudent <= 100)
		        firstStudentScore += studentNoOnetudent+"		";
			subjectOneTotal += studentNoOnetudent;
			firstStudentOneAverage = subjectOneTotal / 3 ;

		}
 	     int subjectTwoTotal = 0 ;
	     int secondStudent = 3 ;
	     String secondStudentScore = "";
	     float secondStudentAverage = 0;


	     System.out.println("How many student do you have? ");
	     int secondStudentNumber = input.nextInt();

	   	     System.out.print("Enter score for student 2 between (1 - 100):  ");
		for(int count = 0 ; count < secondStudent ; count++ ){
			int studentNoTwo = input.nextInt();
			if (studentNoTwo <= 100)
		        secondStudentScore += studentNoTwo+"		";
			subjectTwoTotal += studentNoTwo;
			secondStudentAverage = subjectTwoTotal / 3 ;

		}

 	     int subjectThreeTotal = 0 ;
	     int thirdStudent = 3 ;
	     String thirdStudentScore = "";
	     float thirdStudentAverage = 0f;
	     int thirdNoTwo = 0 ;


	     System.out.println("How many student do you have? ");
	     int thirdStudentNumber = input.nextInt();

	   	     System.out.print("Enter score for student 3 between (1 - 100):  ");
		for(int count = 0 ; count < thirdStudent ; count++ ){
			thirdNoTwo = input.nextInt();
			if (thirdNoTwo <= 100)
			thirdStudentScore += thirdNoTwo+"		"; 
			subjectThreeTotal += thirdNoTwo;
			thirdStudentAverage = subjectTwoTotal / 3 ;

		}

 	     int subjectFourTotal = 0 ;
	     int forthStudent = 3 ;
	     String forthStudentScore = "";
	     float forthStudentAverage = 0f;


	     System.out.println("How many student do you have? ");
	     int forthStudentNumber = input.nextInt();

	   	     System.out.print("Enter score for student 3 between (1 - 100):  ");

		for(int count = 0 ; count < forthStudent ; count++ ){
			int forthNoTwo = input.nextInt();
			if (forthNoTwo <= 100)
		        forthStudentScore += forthNoTwo+"		";
			subjectFourTotal += forthNoTwo;
			forthStudentAverage = subjectFourTotal / 3 ;
		}






			System.out.println("=========================================================================================");
	    		System.out.println("STUDENT	   SUB1	       SUB2	       SUB3	        TOT	AVE");
			System.out.println("=========================================================================================");
			System.out.printf("%4s %4s %d %4f", "student 1",  firstStudentScore, subjectOneTotal, firstStudentOneAverage, "\n");
			System.out.println();

			System.out.printf("%4s %4s %d %4f", "student 2", secondStudentScore, subjectTwoTotal, secondStudentAverage, "\n");
			System.out.println();

			System.out.printf("%4s %4s %d %4f", "student 3", thirdStudentScore, subjectThreeTotal, thirdStudentAverage, "\n");
			System.out.println();

			System.out.printf("%4s %4s %d %4f", "student 4", forthStudentScore, subjectFourTotal, forthStudentAverage, "\n");
			System.out.println();

			System.out.println("=======================================================================================");
			System.out.println("=======================================================================================");

	}
}