import java.util.Scanner;
public class Nested{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

		System.out.print(" Enter digit: ");
		int value = input.nextInt(); 
	switch(value) {
		case 1: 
		case 2:
		case 3:
	break;
	default:
	if (value < 0) { System.out.print("Negative"); }
	else if (value >= 1 && value <= 10) { System.out.print("value is between 1 and 10");}
	else
		System.out.print ("value is greater than 10"); 
		}

		}

	}