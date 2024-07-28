import java.util.Arrays;
public class ElementOnEvenPosition{
	public static void main(String...args){

		int[] element = {1,2,3,4,5,6,7,8};
		ElementOnEvenPosition number = new ElementOnEvenPosition();
		String result  = number.evenNumber(element);
		System.out.print(result);
	}
		public String evenNumber(int[] element){
			String evenCollection = "" ;
			for(int index = 0 ; index < element.length ; index++){
				if(index % 2 == 0 ){
				evenCollection += element[index];
				}
			}
				return evenCollection;
		}
}
