import QueueProject.QueueClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private QueueClass queue ;

    @BeforeEach
    public void setUp() {
        queue = new QueueClass(5);
    }

    @Test
    public void testToCreateQueueClass(){
        queue.isEmpty();
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testToAddElement(){
        queue.add(1);
        assertEquals(queue.getState(), 1);
    }
    @Test
    public void testToCheckIfElementCanBeAddedUpToTheCapacity(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        assertEquals(queue.getState(), 5);
    }
    @Test
    public void testToCheckIfElementCanBeAddedAboveTheCapacity(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        assertNotEquals(queue.getState(), 7);
    }
    @Test
    public void testToRemoveElement(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        assertEquals(queue.getState(), 2);
    }
    @Test
    public void testToCheckIfQueueCanRemoveAllElements(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.remove();
        queue.remove();
        assertEquals(queue.getState(), 0);
    }
    @Test
    public void testToCheckIfQueueCanOfferElements(){
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer();
        assertTrue(queue.offer());
        System.out.println(queue.offer());
    }
//    @Test
//    public void testToCheckIfQueueIsFull(){
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        queue.add(6);
//        assertTrue(queue.isFull());
//    }
}


