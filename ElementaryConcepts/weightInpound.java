import java.util.Scanner;
public class weightInpound{
	public static void main( String ... args){
	 	Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in kilogram: ");
		float weightInKilogram = input.nextFloat();
		
		System.out.print("Enter your height in meter: ");
		int heightInMeter = input.nextInt();

		int totalHeight  = heightInMeter * heightInMeter;
		
		double BMI = weightInKilogram / totalHeight;
	
		System.out.print(BMI) ;
	}
}