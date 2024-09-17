import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class LogisticTest{

	@Test
	public void testingForLogisticSalesAbove70Percent(){
	LogisticFunction logistic = new LogisticFunction();
	int result = logistic.dispatchAboveSeventy(45);
	assertEquals(12200, result);	
	}
}