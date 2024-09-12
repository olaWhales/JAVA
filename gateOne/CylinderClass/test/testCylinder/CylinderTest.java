package testCylinder;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CylinderTest {
    @Test
    public void testThatCylinderClassExist() {
        Cylinder cylinder = new Cylinder();
        int result = cylinder.cylinderClass(6.28318, 5);
        assertEquals(result, 314159);
    }
}
