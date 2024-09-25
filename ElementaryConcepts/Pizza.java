import java.util.Scanner;
public class Pizza{
	public static void main(String...args){
        Scanner input = new Scanner(System.in);

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
	System.out.printf("%s%4d%d%n%s%4d%4d", "Sapa size", 4, 2000,"Small Money", 6, 2400);

	int select = input.nextInt();

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
            default:
					System.out.print("Enter valid option");
		}
	}

		public static String sapaSize(){
			return "Sapa size";
		}
		public static String smallMoney(){
        	return "Small Money";
		}
		public static String bigBoy(){
        	return "Big boy";
		}
		public static String odogwu(){
        	return "Odogwu";
	}

}