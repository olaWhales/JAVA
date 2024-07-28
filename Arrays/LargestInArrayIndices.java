import java.util.Arrays;
public class LargestInArrayIndices{
public static void main(String...args){

	int [] number = {31,22,55,88,90,43,55};
	LargestInArrayIndices largest = new LargestInArrayIndices();
	int result = largest.Arrays(number);
	System.out.print(result);



}
	public int Arrays(int [] element){
	int largest = 0;
	for(int index = 0 ; index < element.length ; index++){
	if(element[index] > largest)
	largest = element[index];
	 	  }
		return largest;
	}
}