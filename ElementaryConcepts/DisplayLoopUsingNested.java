import java.util.Scanner;
public class displayLoopUsingNested {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	for(int i = 1 ; i <= 10 ; i++){
	System.out.println(i);
	}

	int sum = 0 ;
	int num = 10;
	for(num = 1 ; num <= 10 ; num++){
		sum += num ;
		System.out.println(num);
	}
	System.out.println("The total number is " + sum);





	System.out.println("Enter new number ");
	int number = input.nextInt();
	System.out.println("Enter another new number ");
	int number1 = input.nextInt();

	int add = number + number1 ;
	System.out.println("The total numbers is " + add);



	int i = 1 ;
	for(i = 0 ; i <= 5 ; i--){
		System.out.print(i);
}



	}
}