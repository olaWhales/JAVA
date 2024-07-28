import java.util.Arrays;
public class ElementOnOddIndices{
public static void main(String[]args){

	int [] element = {2,3,4,6,7,8,11,23};
	ElementOnOddIndices oddNumber = new ElementOnOddIndices();
	String result = oddNumber.oddNumberInIndices(element);
	System.out.print(result);
	
}

	public String oddNumberInIndices(int[] element){
		String odd = "" ;
		for(int index = 0 ; index < element.length ; index++){
			if(index % 2 == 1)  //index = element[index];
			odd = odd + element[index];
		}
			return odd;
	}	
}