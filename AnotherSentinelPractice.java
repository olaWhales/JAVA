/*import java.util.Scanner;
public class AnotherSentinelPractice{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int number = 0;
		int positive = 0;
		int negative = 0;
		int zero = 0;
			System.out.print("Enter numbers : ");
			int user = input.nextInt();
		while(user != -1){
			System.out.print("Enter numbers : ");
			user = input.nextInt();
			if(user % 2 == 0){ positive = user ;
			positive++;
			}
			else negative = user ;
			negative++;
			if(user <= 0 ) zero = user ;
		}
			System.out.printf("The positive number :" + positive + "\nThe negative numbers are :" + negative + "\nThe zero ('0') number: " + zero);

	}
}
**/






import java.util.Scanner;


public class AnotherSentinelPractice
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int number,          
            countPositive = 0, 
            countNegative = 0,
            countZero = 0;

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }  
}