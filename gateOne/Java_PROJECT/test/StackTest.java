import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack = new Stack(3);

    @Test
    public void testIfStackAvailable() {
    }

    @Test
    public void testIfStackIsEmpty() {
        assertTrue(stack.isStackEmpty());
    }

    @Test
    public void testIfStackCanTakeInElement() {
        stack.push(1);
        stack.push(2);
        assertFalse(stack.isStackEmpty());
    }

    @Test
    public void testIfStackIsTrulyFullWithElement() {
        stack.push(1);
        stack.push(1);
        stack.push(1);
        assertTrue(stack.isFull());
    }

    @Test
    public void testIfStackElementCanReduce() {
        stack.push(1);
        stack.push(1);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        assertTrue(stack.isFull()); ;
    }


}