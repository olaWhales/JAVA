import java.util.Scanner;

public class annualPopulation{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
		System.out.print(" Enter the world Population number : ");
		long worldPopulation = input.nextLong();

		System.out.print(" Enter the world populationGrowth rate : ");
		float yearlyincreament = input.nextFloat();
		
		float  growthRate = yearlyincreament / 100 + 1 ;  
	
	double yearGrowth = worldPopulation * growthRate;

	double populationGrowth = worldPopulation * growthRate ; 
	System.out.print("\n");
	System.out.print("The world population in 2025 will be " + populationGrowth );


	
	}

}