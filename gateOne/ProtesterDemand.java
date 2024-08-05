import java.util.Arrays;
import java.util.Random;
public class ProtesterDemand{
    public static void main(String[]args){
	
	String[] majorityDemand = {"Citizen demand for: Electricity", "Citizen demand for: Petrol", "Citizen demand for: Good Governance", "Citizen demand for: Justice", "Citizen demand for: Constitutional reform", "Citizen demand for: Increment of minimum wages", "Citizen demand for: Education investment", "Citizen demand for: Security reform", "Citizen demand to: Prob past and present leader who had looted and deposit in a special account"};

	String[] protestAgainstMajorityDemand = {"Destruction of properties", "Loss of lives", "Violent"};

		int protest = 9;
		int antiProtest = 3;
		String citizenDemand = "";
		String coveteousDemand = "";

		Random random = new Random();

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("WELCOME TO NIGERIAN UPDATE ON THE ONGOING PROTEST.");
		
		for(int index = 0 ; index <= protest ; index++){
			int randomProtester = random.nextInt(majorityDemand.length);
			citizenDemand = majorityDemand[randomProtester];
		}
			System.out.println();
			System.out.println("This is the majority protester demand: ");
			System.out.println(citizenDemand);

		for(int count = 0 ; count <= antiProtest ; count++){
			int randomAntiProtester = random.nextInt(protestAgainstMajorityDemand.length);
			coveteousDemand = protestAgainstMajorityDemand[randomAntiProtester];
		}
			System.out.println();
			System.out.println("This is anti protester point(COVETEOUSE CITIZEN): ");
			 System.out.println(coveteousDemand);
	}

}