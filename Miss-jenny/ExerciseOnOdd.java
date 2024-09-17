import java.util.Scanner;
public class ExerciseOnOdd{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int num = 0 ;
	int sum = 0 ;

	for(int count = 1 ; count <= 10 ; count++){

	System.out.print("Enter the integer number: ");
	num = input.nextInt();

	if(count %3 == 0){
		sum += num ;
	
}

}
	System.out.println("The sum of the odd number is: "+ sum);

	}
}