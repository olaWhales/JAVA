import java.util.Scanner;
import java.util.Arrays;
public class StringConcatenate{
	public static void main(String...args){
		
		Scanner input = new Scanner(System.in);
		

		String[] letters = {"a","b","c"};
		String[] figures = {"1","2","3","8"};
 
		StringConcatenate concat = new StringConcatenate();
		String[] result = concat.concatenate(letters,figures);
		
		System.out.print(Arrays.toString(result));

	


	}
	public static String[] concatenate(String [] letter , String [] figure){

		String[] both = new String [letter.length + figure.length];

		int counter = 0 ;

		for(int index = 0 ; index < both.length ; index++){
			if(index < letter.length) both[index] = letter[index];
			else both[index] = figure[counter++];
		}
				return both;

	}

}