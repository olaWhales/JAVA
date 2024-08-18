import java.util.Scanner;
public class PetrolMethod{
public static void main(String []args){
Scanner input = new Scanner(System.in);
		
	System.out.print("Location... ");
	String Location = input.nextLine();

	System.out.print("which kind of PETROL would you like to purchase? ");
	String type = input.nextLine();
	
	System.out.print("How many litres? ");
	int quantity = input.nextInt();
	
	System.out.print("How much? ");
	double price = input.nextDouble();

	System.out.print("How many discount? ");
	double discount = input.nextDouble();



	PetrolPurchase petrol = new PetrolPurchase("petrolLocation", "type", quantity, price, discount);
	System.out.print(petrol.getPetrolLocation());
	System.out.print(petrol.getPetrolType());
	System.out.print(petrol.getQuantity());
	System.out.println(petrol.getPrice());
	System.out.print(petrol.discount.DiscountCalculation());




	}
}