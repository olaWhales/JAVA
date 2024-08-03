import java.util.Scanner;
public class SentinelPractice{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);	
	
	int factorial = 10;
	int sum = 1 ;

	for(int i = 1 ; i <= factorial ; i++){
		sum = sum *= i ;
		System.out.println(i);
	}
	System.out.print(sum);


}
}