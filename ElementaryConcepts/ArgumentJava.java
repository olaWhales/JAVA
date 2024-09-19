public class FeetConvertionInJava{
public static void main(String...args){
	
	System.out.print(feetConvertion(12));
}

	public static double feetConvertion(int feet){
		double meter = 0.302;
		double result = feet * meter ;
		return result;
	}
}