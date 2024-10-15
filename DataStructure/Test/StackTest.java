import StackStructure.StackClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private StackClass stacks;

    @Before
    public void setUp() {
        stacks = new StackClass(5);
    }
    @Test
    public void testToCheckIfStackIsEmpty(){
        stacks.isEmpty();
        assertTrue(stacks.isEmpty());
    }
    @Test
    public void testToCheckIfStackCanPushElement() {
        stacks.push(1);
        assertEquals(stacks.getState(), 1);
    }
    @Test
    public void testToCheckIfStackCanPushElementMoreThanOneElement() {
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        assertEquals(stacks.getState(), 5);
    }
    @Test
    public void testToCheckIfStackCanPushElementAboveTheStackSize() {
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.push(6);
        assertNotEquals(stacks.getState(), 6);
    }
    @Test
    public void testToCheckIfStackCanPopElement() {
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.pop();
        stacks.pop();
        assertEquals( 2, stacks.pop());
    }
    @Test
    public void testToCheckIfStackCanPeekElement() {
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.peek();
        assertEquals( 3, stacks.peek());
    }
    @Test
    public void testToCheckIfStackCanPeekElementMoreThanOneElement() {
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.peek();
        stacks.peek();
        assertNotEquals( 1, stacks.peek());
    }
    @Test
    public void testToCheckIfStackCanSearchObjectInTheStack() {
        stacks.push(1);
        stacks.push(2);
        stacks.push(5);
        stacks.search(1);
        assertEquals(3 , stacks.getState());
    }
}
