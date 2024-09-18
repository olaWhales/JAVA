import java.util.Scanner;

public class LargestAndSmallInteger{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		System.out.print(" Enter first number : ");
		int num1 = input.nextInt();

		System.out.print(" Enter second number : ");
		int num2 = input.nextInt();

		System.out.print(" Enter third number : ");
		int num3 = input.nextInt();

		System.out.print(" Enter forth number : ");
		int num4 = input.nextInt();

		System.out.print(" Enter fifth number : ");
		int num5 = input.nextInt();

if(num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5 ){ System.out.println(" Number 1 is the greatest: " + num1);
}
if(num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5 ){ System.out.println(" Number 2 is the greatest: " + num2);
}
if(num3 >= num1 && num1 >= num2 && num3 >= num4 && num3 >= num5 ){ System.out.println(" Number 3 is the greatest: " + num3);
}
if(num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5 ){ System.out.println(" Number 4 is the greatest: " + num4);
}
if(num5 >= num1 && num5 >= num2 && num5 >= num3 && num5 >= num4 ){ System.out.println(" Number 5 is the greatest: " + num5);
}

if(num1 <= num2 && num1 <= num3 && num1 <= num4 && num1 <= num5 ){ System.out.println(" Number 1 is the lowest: " + num1);
}
if(num2 <= num1 && num2 <= num3 && num2 <= num4 && num2 <= num5 ){ System.out.println(" Number 2 is the lowest: " + num2);
}
if(num3 <= num1 && num1 <= num2 && num3 <= num4 && num3 <= num5 ){ System.out.println(" Number 3 is the lowest: " + num3);
}
if(num4 <= num1 && num4 <= num2 && num4 <= num3 && num4 <= num5 ){ System.out.println(" Number 4 is the lowest: " + num4);
}
if(num5 <= num1 && num5 <= num2 && num5 <= num3 && num5 <= num4 ){ System.out.println(" Number 5 is the lowest: " + num5);
}

	}
}