import java.util.Arrays;
public class ArraysWithLoop{
public static void main(String...args){

	int [] practice = new int[10];
	int sum = 0 ;
	double average = 0 ;

	for(int count = 0 ; count < practice.length ; count++){
	practice[count] = count+1;
	sum += practice[count];
	average = sum/practice[count];
	
}
	System.out.println(Arrays.toString(practice));
	System.out.println("The total of the number is : " + sum);
	System.out.printf("The average of total number is : " + average,1.f);

}
}