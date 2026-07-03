import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    private MyQueue myQueue;

    @BeforeEach
    public void setMyQueue(){
        myQueue = new MyQueue();
    }

    @Test
    public void testThatMethodAddWorks(){
        String name = "Miracle";
        ArrayList <String> decoy = new ArrayList<>();
        decoy.add(name);
        assertTrue(myQueue.add(name));
    }

    @Test
    public void testThatMethodElementWorks(){
        myQueue.add("miracle");
        myQueue.add("is a billionaire");
        assertEquals("miracle", myQueue.element());
    }

    @Test
    public void testThatMethodPeeksWorks(){
        myQueue.add("miracle");
        myQueue.add("is a billionaire");
        assertEquals("miracle", myQueue.peek());
    }

    @Test
    public void testThatMethodPollsWorks(){
        myQueue.add("miracle");
        myQueue.add("is a billionaire");
        assertEquals("miracle", myQueue.poll());
        assertEquals(1, myQueue.queueList.size());
    }

    @Test
    public void testThatMethodRemoveWorks(){
        myQueue.add("miracle");
        myQueue.add("is a billionaire");
        assertEquals("miracle", myQueue.remove());
        assertEquals(1, myQueue.queueList.size());
    }

    @Test
    public void testThatAddMethodThrowsErrorForNullArguement(){
        assertThrows(NullPointerException.class, () -> myQueue.add(null));
    }

    @Test
    public void testThatMethodPollReturns_Null_IfTheresNoThingInTheList(){
        assertEquals(null, myQueue.poll());
    }

    @Test
    public void testThatMethodElementThrowsAnExceptionIfListIsEmpty(){
        assertThrows(NoSuchElementException.class,() -> myQueue.element());
    }

    @Test
    public void testThatMethodPeekReturnsNullIfListIsEmpty(){
        assertEquals(null, myQueue.peek());
    }
}
