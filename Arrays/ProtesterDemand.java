import java.util.Arrays;
import java.util.Random;
public class ProtesterDemand{
    public static void main(String[]args){
	
	String[] majorityDemand = {"Electricity", "Petrol", "Good Governance", "Justice", "Constitutional reform", "Increment of minimum wages", "Education investment", "Security reform", "Prob past and present leader who had looted and deposit in a special account"};

	String[] antiMajorityDemand = {"Destruction of properties", "Loss of lives", "Violent"};

	ProtesterDemand demand = new ProtesterDemand();
	String[] result = demand.protester(majorityDemand, antiMajorityDemand);
	
	for(String solution : result){
	System.out.print(solution);
	} 
    }


	public static String [] protester(String[] protester, String[] antiProtester){
		String [] protest = new String[9];
		String [] antiProtest = new String[3];
		
		Random random = new Random();

		for(int index = 0 ; index < 9 ; index++){
			protest[index] = protester[random.nextInt(protester.length)];
		}

		for(int count = 0 ; count < 3 ; count++){
			antiProtest[count] = antiProtest[random.nextInt(antiProtester.length)];
		}
			// return protest;
			return antiProtester;
	}
}