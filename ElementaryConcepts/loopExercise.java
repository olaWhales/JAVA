import java.util.Scanner;
public class loopExercise{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	int pass = 0;
	int fail = 0 ;
	int qualify = 45;
	for(int count = 1 ; count <= 10 ; count++){

	System.out.print("Enter number");
	int user = input.nextInt();

	if(user > qualify)
		pass+=1;
		pass = pass + user;
		System.out.println(pass);
	if(user < qualify)
		fail+=1 ;
		fail = fail + user;
		System.out.println(fail);
}

	System.out.println("Total of pass student: " + pass);
	System.out.print("Total of fail student: " + fail);

}
}