import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MathToolstest{

	@Test
	public void MatheToolstestPractice(){

	MathTools mathtools = new MathTools();
	double negativeResult = mathtools.raisetoPower(-4,-4);
	assertEquals(-0.00390625 , negativeResult);


}
}