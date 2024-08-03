import java.util.Scanner;
public class ExerciseOnOdds{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int num = 10;
	int sum = 0 ;
	int user = 0 ;
		
	
	for(int count = 1 ; count <= num ; count++){

	System.out.print("Enter the integer number: ");
	user = input.nextInt();
		if(num %2 == 0){
				sum += user ;
			}
}
			System.out.print(sum);
}
}