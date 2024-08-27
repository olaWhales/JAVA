public class Pizza{
	public static void main(String...args){	

	System.out.print("Welcome to Iya Abimbola Pizza hub");
	System.out.println();
	System.out.println("""
				This are all type of pizza we have
				Enter the number for your level size
				1: Sapa size	[]
				2: Small Money
				3: Big boys
				4: Odogwu
			""");
	System.out.println("-----------------------------------------");
	System.out.printf("%s%4s%4s", "PizzaType", "Number of Slide", "Price per box");
	System.out.printf("%s%4d%4d", "Sapa size", 4, 2000, \n "%s%4d%4d", "Small Money", 6, 2400);

	String select = input.nextInt();

		switch (select){


				case 1  : 
					sapaSize();
					break;
				case 2 : 
					smallMoney();
					break;
				case 3 :
					bigBoy();
					break;
				case 4 :
					odogwu();
					break;
				default;
					System.out.print("Enter valid option");
				}
	

	} 

	public static String sapaSize(){

	}	
	public static String smallMoney(){

	}
	public static String bigBoys(){

	}
	public static String odogwu(){

	}
}