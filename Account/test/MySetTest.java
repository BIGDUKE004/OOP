import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    private MySet mySet;

    @BeforeEach
    public void setMySet(){
        mySet = new MySet();
    }

    @Test
    public void testThatSetListIsEmpty(){
        mySet.add("mariam");
        assertFalse(mySet.setIsEmpty());
    }

    @Test
    public void testThatMethodAddWorks(){
        String [] setList = new String[10];
        setList[0] = "mariam";
        assertTrue(mySet.add("mariam"));
    }

    public void testThatIAddValuesToEmptySet(){
        String check = "empty";
        ArrayList <String> list =  new ArrayList<>();
        list.add(check);
        assertTrue(mySet.add(check));
        assertEquals(list, mySet.set);
    }

    @Test
    public void testThatIaddADuplicateValueAndReturnsFalseWithoutUpdatingTheSet(){
        String check = "empty";
        String name = "miracle";
        ArrayList <String> list =  new ArrayList<>();
        list.add(check);
        list.add(name);
        mySet.add(check);
        mySet.add(name);
        assertFalse(mySet.add("empty"));
        assertEquals(list, mySet.set);
    }

    @Test
    public void testThatWeGetAnExceptionWhenAddingNullToSet(){
        assertThrows(NullPointerException.class, () -> mySet.add(null));
    }

    @Test
    public void testThatMethodContainsHelpsToFindAnElement(){
        String check = "my future is bright";
        mySet.add("value");
        mySet.add(check);
        mySet.add("i'm in a good youthful figure");
        assertTrue(mySet.contains(check));
    }

    @Test
    public void testThatWeGetAnExceptionWhenCheckingNullInSet(){
        assertThrows(NullPointerException.class, () -> mySet.contains(null));
    }


}