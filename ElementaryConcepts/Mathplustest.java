import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Mathplustest{


	@Test
	public void testForSinpleMathematics(){


	Mathematics mathematics = new Mathematics();
	int result = mathematics.addition(4,5);
	assertEquals(9, result);	
		
}
}