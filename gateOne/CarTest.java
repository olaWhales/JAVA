import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CarTest{


	public testForCarPriceDiscount(){

	@Test;
	//given
	Car car = new Car();
	//when
	double result = car.calculateFirstCarDiscount(2000);
	//assert
	assertEquals(result, 1900);
}

}