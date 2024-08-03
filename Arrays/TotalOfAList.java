import java.util.Arrays;
public class TotalOfAList{
	public static void main(String...args){

			int [] element = {1,12,3,4,5,6,7,8,9,20};
			TotalOfAList all = new TotalOfAList();
			int result = all.total(element);
			System.out.print(result);
	}
		public int total(int [] number){
				int sum = 0;
			for(int count = 0 ; count < number.length ; count++){
				sum = number[count] + sum;
			}
				return sum;
		}
}