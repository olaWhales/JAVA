import java.util.Scanner;
public class ClassWorkOne{
public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
		int num = 10 ;

	for(int count = 0 ; count <= num ; count++){

		System.out.println("Enter number from 1 - 10: ");
		int number = input.nextInt();

		if(number == 1){ 
			System.out.println("One");
		}else if(number == 2){
			System.out.println("Two");
		}else if(number == 3){
			System.out.println("Three");
		}else if(number == 4){
			System.out.println("Four");
		}else if(number == 5){
			System.out.println("Five");
		}else if(number == 6){
			System.out.println("Six");
		}else if(number == 7){
			System.out.println("Four");
		}else if(number == 8){
			System.out.println("Eight");
		}else if(number == 9){
			System.out.println("Nine");
		}else if(number == 10){
			System.out.println("Ten");
		}else{
			System.out.println("Enter a valid number");
			}
		}

	}
}