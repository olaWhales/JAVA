import java.security.SecureRandom;
import java.util.Arrays;
public class RandomPractice{
	public static void main(String...args){
	
		SecureRandom random = new SecureRandom();
		int [] frequency = new int[7];
	
		for(int count = 1 ; count <= 60000 ; count++){
			frequency[ 1 + random.nextInt(6)]++;
		}
			System.out.printf("%s%10s%n", "face", "frequency");

		for(int face = 1 ; face < frequency.length ; face++){
			System.out.printf("%4d%10d%n", face, frequency[face] );
		}
	}
}