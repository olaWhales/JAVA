import SetProject.SetClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SetTest {
    @Test
    public void testToCreateClass() {
        SetClass setClass = new SetClass(10);
    }
    @Test
    public void testToSetTheCapacity() {
        SetClass setClass = new SetClass(10);
        assertEquals(setClass.size(), 0);
    }
    @Test
    public void testToSetIfSetIsEmpty() {
        SetClass setClass = new SetClass(10);
        setClass.isEmpty();
        assertTrue(setClass.isEmpty());
    }
    @Test
    public void testToCheckIfSetCanAddElementAndCheckIfContains() {
        SetClass setClass = new SetClass(3);
        setClass.add(1);
        setClass.add(2);
        setClass.add(3);
        assertTrue(setClass.contain(3));
    }
    @Test
    public void testToCheckIfSetNotContainsElementAndCheckIfNotIncluded() {
        SetClass setClass = new SetClass(4);
        setClass.add(1);
        setClass.add(2);
        setClass.add(3);
        setClass.add(4);
        assertFalse(setClass.contain(8));
    }

    @Test
    public void testToIterateThroughSet() {
        SetClass setClass = new SetClass(4);
        setClass.add(1);
        setClass.add(4);
        setClass.add(3);
        setClass.add(8);
        int[] set = setClass.get();
        assertEquals("[1, 4, 3, 8]", Arrays.toString(set));
    }
}
