import java.util.Scanner;
public class DiameterCircumferenceAndArea{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of a circle: ");
		int radius = input.nextInt();

		int diameter = radius * 2 ;
		double circumferences = radius * 3.14159 ;
		double area = 3.14159 * diameter ;

		System.out.printf("%s%d\n%s%f\n%s%f\n"," The diameter number is ", diameter ," The circumfeference number is ", circumferences ," The area number is ", area );

		
		
	}

}