import java.util.Arrays;
public class StudentPollArrays{
	public static void main(String...args){
		int [] responses = {1,1,2,3,4,5,4,3,2,5,6,7,7,5,8,2,4,};
		int [] frequency = new int [9];

		for(int index = 0 ; index < responses.length ; index++){
			try { 
			++frequency[responses[index]];
			}
			catch (ArraysIndexOutOfBoundsException e){
			System.out.print(e);
			System.out.printf(" responses[%d] = %d%n%n" , index, responses[index]);
			}
			
			System.out.print(frequency);
		}
	}
}