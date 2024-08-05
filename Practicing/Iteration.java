import java.util.Scanner;
public class Sentinel{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int mile;
	int gallon = 0; 
		System.out.print("Enter the number of gallon used or -1 to terminate: ");
		mile = input.nextInt();

		while(mile != -1){
			gallon += mile ; 

			System.out.println("Enter the number of gallon used or -1 to terminate: ");
			mile = input.nextInt();
		}
			System.out.print("The combile miles per gallon for all trip is : " + gallon );



	}


}