public class Forloop{
	public static void main(String [] args){

	int num = 10 ;
	int sum = 0 ;
	int average = 0 ;	
	for(num = 1 ; num <= 10 ; num++){
		sum += num ;
		average = sum / 2 ;
		System.out.print(num);
	}
		System.out.println(" The sum of all score is: " + sum );
		System.out.println(" This is the average score of the: " + average);
}

}