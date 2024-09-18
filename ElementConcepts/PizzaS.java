import java.util.Scanner;
public class PizzaS{
	public static void main(String...args){	
	Scanner input = new Scanner(System.in);

	System.out.print("Welcome to Iya Abimbola Pizza hub");
	System.out.println();
	System.out.print("""
				This are all type of pizzas we have
				=====================================================
				Enter the number for your level size
				=====================================================
				   PizzaType	Number of Slide		Price per box
				1: Sapa size	4			2000	
				2: Small Money	6			2400
				3: Big boys	8			3000
				4: Odogwu	12			4200
			""");
	int select = input.nextInt();
		switch (select) {
				case 1  : 
					System.out.print("How many numbers of people ");
					int numberOfCustomer = input.nextInt();
					int numberOfSlides = 4;
					int pricePerOne = 2000;
					int total = numberOfCustomer / numberOfSlides;
					int bill = total * numberOfSlides ;
					System.out.print("For number of boxes of pizza to buy is = " + total + " boxes (sapaSize contains 4 pizza per boxes)" + total + " boxes shoud be sufficient for" + numberOfCustomer + "people");

					break;
				case 2 : 
					System.out.print("How many numbers of people ");
					numberOfCustomer = input.nextInt();
					numberOfSlides = 6;
					pricePerOne = 2400;
					total = numberOfCustomer / numberOfSlides;
					bill = total * numberOfSlides ;
					System.out.print("For number of boxes of pizza to buy = " + total + "boxes (SmallMoney contains 6 pizza per boxes)" + total + " boxes shoud be sufficient for" + numberOfCustomer + "people");

					break;
				case 3 :
					System.out.print("How many numbers of people ");
					numberOfCustomer = input.nextInt();
					numberOfSlides = 8;
					pricePerOne = 3000;
					total = numberOfSlides / numberOfSlides;
					bill = total * numberOfSlides ;
					System.out.print("For number of boxes of pizza to buy = " + total + "boxes (Big boys contains 8 pizza per boxes)" + total + " boxes shoud be sufficient for" + numberOfCustomer + "people");

					break;
				case 4 :
					System.out.print("How many numbers of people ");
					numberOfCustomer = input.nextInt();
					numberOfSlides = 12;
					pricePerOne = 4200;
					total = numberOfCustomer / numberOfSlides;
					bill = total * numberOfSlides ;
					System.out.print("For number of boxes of pizza to buy = " + total + "boxes (sapaSize contains 12 pizza per boxes)" + total + " boxes shoud be sufficient for" + numberOfCustomer + "people");

					break;
				default:
					System.out.print("Enter valid option");
				}

	

	
}
}