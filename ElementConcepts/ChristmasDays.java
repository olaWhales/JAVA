import java.util.Scanner;
public class ChristmasDays{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

		for(int i = 1 ; i <=12 ; i++){
	System.out.print("Enter the number of day for song you do like to listening to: ");
	int days = input.nextInt();



		switch(i){

	case 1: System.out.println("Monday:") ;
		System.out.println("my true love sent to me a partridge in a pear tree.");
		break;

	case 2: System.out.println("Tuesday:") ;
		System.out.println("my true love sent to me Two turtle doves,and a partridge in a pear tree.");
		break;

	case 3: System.out.println("Wednesday:") ;
		System.out.println("my true love sent to me Three French hens,Two turtle doves,And a partridge in a pear tree.");
		break;

	case 4: System.out.println("Thursday:") ;
		System.out.println("my true love sent to me Four calling birds,Three French hens,Two turtle doves,And a partridge in a pear tree.");
		break;

	case 5: System.out.println("Friday:") ;
		System.out.println("my true love sent to me"+"Five golden rings,"+"Four calling birds,"+"Three French hens,Two turtle doves And a partridge in a pear tree."); 
		break;

	case 6: System.out.println("Saturday:") ;
		System.out.println("my true love sent to me Six geese a-laying,Five golden rings,"+ "Four calling birds,Three French hens,Two turtle doves,And a partridge in a pear tree.");
		break;

	case 7: System.out.println("Sunday:") ;
		System.out.println("my true love sent to meSeven swans a-swimming,Six geese a-laying,"+"Five golden rings,Four calling birds,Three French hens,Two turtle doves,"+"And a partridge in a pear tree.");
		break;

	case 8: System.out.println("Monday:") ;
		System.out.println("my true love sent to me,Eight maids a-milking,Seven swans a-swimming,Six geese a-laying,"+
"Five golden rings,Four calling birds,Three French hens,Two turtle doves,And a partridge in"+" a pear tree.");
		break;

	case 9: System.out.println("Tuesday:") ;
		System.out.println("my true love sent to meNine ladies dancing,Eight maids a-milking,Seven swans a-swimming,Six geese a-laying,Five"+ "golden rings,Four calling birds,Three French hens,Two turtle doves,And a partridge in a pear tree.");
		break;

	case 10: System.out.println("Wednesday:") ;
		System.out.println("my true love sent to meTen lords a-leaping,Nine ladies dancing,Eight maids a-milking,Seven swans a-swimming,Six geese a-laying,"+"Five golden rings,Four calling birds,Three French hens,Two turtle doves,And a partridge in a pear tree.");
		break;

	case 11: System.out.println("Thursday:") ;
		System.out.println("my true love sent to me Twelve drummers drumming,Eleven pipers piping,Ten lords a-leaping,Nine ladies dancing,"+"Eight maids a-milking,Seven swans a-swimming,Six geese a-laying,Five golden rings,"+"Four calling birds,Three French hens,Two turtle doves,And a partridge in a pear tree!");
		break;

	case 12: System.out.println("Friday:") ;
		System.out.println("my true love sent to me,Twelve drummers drumming,Eleven pipers piping,Ten lords a-leaping,Nine ladies dancing,"+"Eight maids a-milking,Seven swans a-swimming,Six geese a-laying,Five golden rings,"+"Four calling,birds,Three French hens,Two turtle doves,And a partridge in a pear tree!");

		default:
System.out.println("The number for music is invalid.");

}
	}
}
}