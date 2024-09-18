//package gateOne.Java_PROJECT.test;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Stack;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class StackTest {
//    Stack stack = new Stack();
//
//    @Test
//    public void testIfStackAvailable() {
//    }
//
//    @Test
//    public void testIfStackIsEmpty() {
//        assertTrue(stack.isEmpty());
//    }
//
//    @Test
//    public void testIfStackCanTakeInElement() {
//        stack.push(1);
//        stack.push(2);
//        assertFalse(stack.isEmpty());
//    }
//
//    @Test
//    public void testIfStackIsTrulyFullWithElement() {
//        stack.push(1);
//        stack.push(1);
//        stack.push(1);
//        assertTrue(stack.isFull());
//    }
//
//    @Test
//    public void testIfStackElementCanReduce() {
//        stack.push(1);
//        stack.push(1);
//        stack.push(1);
//        System.out.println(stack);
//        stack.pop();
//        assertTrue(stack.isFull()); ;
//    }
//
//
//}