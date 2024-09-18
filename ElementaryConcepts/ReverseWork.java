import java.util.Scanner;
import java.util.Arrays;
public class ReverseWork{
public static void main(String...args){
	Scanner input = new Scanner(System.in);
	
	
	int[] num = {-1,-2,-3,-4,5,6,7,-8,9};
	ReverseWork work = new ReverseWork();
	int[] result = work.reverse(num);
	System.out.print(Arrays.toString(result));
	

}
	public int[] reverse(int[] element ){
		int[] number = new int [element.length];
		int numberRev = 0 ;
			for(int indexes = element.length-1 ; indexes >= 0 ; indexes-- ){
				number[numberRev] = element[indexes];
				numberRev++;
			}
				return number;
	}
		
}
