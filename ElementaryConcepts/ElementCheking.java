import java.util.Scanner;
public class ElementCheking{
public static void main(String...args){
	Scanner input = new Scanner(System.in);

	int[] element = {1,6,8,99,12,21,34,55};
	System.out.print("Enter any number to check if it's include in a list: ");
	int number = input.nextInt();

	ElementCheking check = new ElementCheking();
	boolean result = check.checking(element,number);
	
	System.out.print(result);

}

	public boolean checking(int [] element,int number){
			for(int index = 0 ; index < element.length ; index++){
			if(number == element[index])
			return true;
		}
			return false;
	}
}

