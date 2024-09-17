import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MbtiTest{
	
	@Test
	public void checkingForE(){

	
	MbtiAnotherMethod mbti = new MbtiAnotherMethod();

	string [] question = {"A","B","A","B","A","B","A","B","A","B","A","B","A","B","A","B","A","B","A","B"};
	String response = mbti.getResponse(question);
	
	assertEquals("E" , response);





	}


}