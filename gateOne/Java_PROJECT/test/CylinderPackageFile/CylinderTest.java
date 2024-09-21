package CylinderPackageFile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.Assert.assertTrue;

class CylinderTest {

    private Cylinder cylinder;

    @BeforeEach
    public void setUp() {
        cylinder = new Cylinder(8,6);
    }
    @Test
    void test_that_method_exists() {
    }
    @Test
    void test_that_radius_method_exists() {
        cylinder.getRadius();
        assertTrue(true);
    }
    @Test
    void test_that_height_method_exists() {
        cylinder.getHeight();
        assertTrue(true);
    }
    @Test
    void test_if_radius_and_height_method_can_calculate_number_of_volume() {
        int result = cylinder.totalCalculation(8 , 6);
        Assertions.assertEquals(result, 150.0);
    }
}