import java.util.Scanner;
public class LogisticMainMethod{
	public static void main(String...args){
	   Scanner input = new Scanner(System.in);

	   LogisticFunction pays = new LogisticFunction();
		System.out.print("How much do the rider sold today ");
		int rider = input.nextInt();
	  	int result = pays.dispatch(rider);
		System.out.print("Your today payment is " + result); 
	}
}