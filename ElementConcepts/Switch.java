import java.util.Scanner;
public class Switch{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the minutes of your birthday: ");
	int birthday = input.nextInt();
	
	switch(birthday){
		case 10: System.out.print("A");
			break;
		case 20: System.out.print("B");
			break;
		case 30: System.out.print("C");
			break;
		default:
			System.out.print("Your date representation isn't included");

}


}
}