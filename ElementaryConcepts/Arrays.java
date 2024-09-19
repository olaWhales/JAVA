import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Arrays{

	@Test
	public void testingArraysFunction(){

	Arrays array = new Arrays();
	int result = array.ArrayRePracticing(7,8,9,2,10,1,5,3);
	assertEquals(result, 123578910);

}
}