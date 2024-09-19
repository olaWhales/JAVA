import java.util.Arrays;
import java.util.Scanner;
public class MbtiSecondMethod{
	public static void main(String...args){
		Scanner input = new Scanner(System.in);


	MbtiSecondMethod personal = new MbtiSecondMethod();
	String [] respondFromUsers = new String[5];
	String [] test = personal.myersBridge(respondFromUsers);
	System.out.print(Arrays.toString(test));

}
	
	public static String [] myersBridge(String [] questions) {

		String [][] responds = {
					{"(A) Expand energy,enjoy group.","(A) More ongoing,think out loud.","(A) Seek many task,public activity,interraction with other.","(A) Externsal,communicative,express yourself.","(A) Active,initiate."},
					{"(B) Conserve energy, enjoy one on one.","(B) More reserve,think to yourself","(B) Seek private,acrivity with quiet to concentrate","(B) Internal,reticent,keep to yourself","(B) Reflection,deliberate"}
					};

		String [] A = new String[responds.length];
		String [] B = new String[responds.length];

			for(int index = 0 ; index < responds.length ; index++){
					if(responds.equals("A")) questions[index] = responds[index][0];
					else if(responds.equals("B")) questions[index] = responds[index][1];	
			}
					return questions;

	}
	
}