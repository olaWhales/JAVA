import java.util.Scanner;
public class StudentMark{
public static void main(String...args){
	
	Scanner olawale = new Scanner(System.in);

	int number = 0;
	int max = 0;
	int min = 0;

	for(int count = 1 ; count <= 5 ; count++){
	 	System.out.print(Enter number);
		number = olawale.nextInt();

		if(number > min)
			min = number;
			System.out.print(min);
		if(number < max)
			max = number;
			System.out.print(max);

		}

		System.out.print("The minimum num is : " + min)
		System.out.print("The maximum num is : " + max)

}

}