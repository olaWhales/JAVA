import java.util.Random;
import java.util.Scanner;
public class Mbti{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);

	Mbti personal = new Mbti();
	String [] test = personal.estrovertAndIntrovert();
	System.out.print("Enter (A) or (B) to select ");
	String result = input.nextLine();
	System.out.print(result);
}
	
	public static String [] estrovertAndIntrovert(String[] question1) {

		String [] respondA = {
					"(A) Expand energy,enjoy group.",
					"(A) More ongoing,think out loud.",
					"(A) Seek many task,public activity,interraction with other.",
					"(A) Externsal,communicative,express yourself.",
					"(A) Active,initiate.",
				};
			 
		String [] respondB = {
					"(B) Conserve energy, enjoy one on one.",
					"(B) More reserve,think to yourself",
					"(B) Seek private,acrivity with quiet to concentrate",
					"(B) Internal,reticent,keep to yourself",
					"(B) Reflection,deliberate",
				};

		String [][] userRespond = new String[respondA.length][respondB.length];
		String [][] totalRespond = new String[respondA.length][respondB.length];
		String [] A = new String[userRespond.length];
		String [] B = new String[userRespond.length];



			for(int index = 0 ; index < totalRespond.length ; index++){
				if(userRespond[index] == A) question1 = userRespond[index];
				else if(userRespond[index] == B) question1 = userRespond[index];				
					return question1 ;
			}

	}

/*
	public static String [] sensingAndIntuitive(String [] question2){


		String [] respondA = {
					"(A) Interpret literally.");"(B) Look for meaning and possibility",
					"(A) Practical,realistic,experiential.",
					"(A) Standard,ussual,conventional",
					"(A) Interpret literally.",
					"(A) Fact,thing,what is.",
				};	
		String [] respondB = {
					"(B) Look for meaning and possibility",
					"(B) Imagination,innovation,theoretical",
					"(B) Different,novel,unique",
					"(B) Look for meaning and possibility",
					"(B) Ideas,dreams,what could be,philosophical",
				};

		String [][] userRespond = new String[respondA.length][respondB.length];
		String [][] totalRespond = new String[respondA.length][respondB.length];
		String [] A = new String[userRespond.length];
		String [] B = new String[userRespond.length];

	}

	public static String [] thinkingAndFeeling(String [] question3){

		String [] respondA = {
					"(A) logical,thinking,questionaing.",
					"(A) Candid,straigh forward.",
					"(A) Firm,tend to critisize,hold the line.",
					"(A) Tough minded,just.",
					"(A) Matter of fact,issue-orieted.",
				};
	
		String [] respondB = {
					"(B) Empathetic,feeling,accomodation",
					"(B) Tactful kind,encouraging",
					"(B) Gentle,tent to appreciate,conciliate",
					"(B) Tender hearted,merciful.",
					"(B) Sensitive,people-oriented,compassionate",
				};

		String [][] userRespond = new String[respondA.length][respondB.length];
		String [][] totalRespond = new String[respondA.length][respondB.length];
		String [] A = new String[userRespond.length];
		String [] B = new String[userRespond.length];

	}

	public static String [] judgingAndPerceptive(String [] question4){

		String [] respond = {
					"(A) Organization,orderly.",
					"(A) Schedule,plan.",
					"(A) Regulated,structured.",
					"(A) Preparation,plan ahead.",
					"(A) Control,govern.",
				};

		String [] respond = {
					"(B) Flexible,adaptaion",
					"(B) Unplanned,spontaneous",
					"(B) Easy going,live and let live",
					"(B) Go with the flow,adapt as you go",
					"(B) Latitude,freedom",
				};	 

		String [][] userRespond = new String[respondA.length][respondB.length];
		String [][] totalRespond = new String[respondA.length][respondB.length];
		String [] A = new String[userRespond.length];
		String [] B = new String[userRespond.length];

	}**/
}