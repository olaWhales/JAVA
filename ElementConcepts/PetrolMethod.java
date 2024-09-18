import java.util.Scanner;
public class PetrolMethod{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
		
	System.out.print("Location... ");
	String location = input.nextLine();

	System.out.print("which kind of PETROL would you like to purchase? ");
	String type = input.nextLine();
	
	System.out.print("How many litres? ");
	int quantity = input.nextInt();
	
	System.out.print("How much? ");
	double price = input.nextDouble();

	System.out.print("How many discount? ");
	double discount = input.nextDouble();

	System.out.println();



	PetrolPurchase petrol = new PetrolPurchase(location, type, quantity, price, discount);
	System.out.println("The petrol locatoon is <<>>" + petrol.getPetrolLocation());
	System.out.println("The type of petrol bought by the customer is ---" + petrol.getPetrolType());
	System.out.println("The litres bought is " + petrol.getQuantity() + " litres");
	System.out.println("Price = " + petrol.getPrice());
	System.out.println("Amount to pay after the discount is = #" + petrol.discountCalculation());
	System.out.print("THANK YOU FOR THE PATRONAGE") ;




	}
}