import java.util.Scanner;
public class Grade{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter your grade : ");
	int gradeInput = input.nextInt();

	if(gradeInput > 80 ){
		System.out.print("Your grade is A");
	}	
	if(gradeInput <= 80 && gradeInput > 70 ){
		System.out.print("Your grade is B");
	}
	if(gradeInput <= 70 && gradeInput > 60 ){
		System.out.print("Your grade is B");
	}	
	if(gradeInput < 60 && gradeInput > 50){
		System.out.print("Your grade is D");
	}
	else{
		System.out.print("Your're failed");

}
}
}