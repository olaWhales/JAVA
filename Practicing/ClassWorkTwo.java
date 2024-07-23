import java.util.Scanner;

public class ClassWorkTwo{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
		int number;
		int total = 0 ;

System.out.println("Enter any number and see the total of numbers that divisible by:  ");
		number = input.nextInt();

	for(int count = 1 ; count <= number/2 ; count++){

		if(count % number == 0 ) {
			total++ ;
}
}
			System.out.println(total);


}

}