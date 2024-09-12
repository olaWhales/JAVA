package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class test {
    @Test
    public void testingForArraysSorting(){
        Classwork classwork = new Classwork();
        int []number = new int[1, 2, 3, 4, 5];
        int result = classwork.arraysort(number);
        assertEquals([5,4,3,2,1] , result);
    }
}
