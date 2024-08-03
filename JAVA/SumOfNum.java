public class SumOfNum{
public static void main(String [] args){
	int number = 10 ;
	int sum = 0 ;
	
	for(int i = 1 ; i <= number ; i++){
		sum = sum += number ;
		System.out.println(i);
	}
		System.out.print("This is the sum of all natural numbers: " + sum);

}
}