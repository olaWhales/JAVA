public class FactorialNO4{
	public static void main(String...args){
		int factorial = 1;
		int number = 10;
		for(int count = 1 ; count <= number ; count++){
			factorial *= count;
		}
			System.out.print("The factorial of user input is " + factorial);

	}
}