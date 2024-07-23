import java.util.Scanner;
public class StudentPassGrade{
	public static void main(String[]args){

	Scanner input = new Scanner(System.in);

int score = 0 ;
int mark = 45 ;
int pass = 0 ;
int fail = 0 ;
for(int count = 1 ; count <= 5 ; count++){

	System.out.print("Enter scores: ");
	score = input.nextInt();

	if(score > mark)
		pass = score;


	if(score < mark && score != 0)
		fail = score ;	
	}

System.out.println("Total student pass: " + pass);
System.out.print("Total student fail: " + fail);
}
}