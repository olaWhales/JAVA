import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class bike {
    @org.junit.Test
    @Test
    public void testingIfBikeCanTurnOn(){
        Bike bike = new Bike();
        bike.BikeOn();
        assertEquals(true, bike.isOperate());
    }


}
