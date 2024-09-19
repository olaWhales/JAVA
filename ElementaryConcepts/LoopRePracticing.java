import java.util.Arrays;
public class ArrayRePracticing{
public static void main(String[]args){

	int number = new int[10];
	int sort = 0;
	for(int index = 1; index < number.length ; index++){
	for(int count = index ; count < number.length ; count++){
		if(number[index] > number[count]){
			sort = number[index];
			number[index] = number[count];
			number[count] = sort;
			}
		}
	}
			if(result = number[index])
			System.out.print("result");
}
}
