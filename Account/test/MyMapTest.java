import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyMapTest {

    private MyMap map;

    @BeforeEach
    public void setMap(){
        map = new MyMap();
    }

    @Test
    public void testThatListIsEmpty(){

        assertTrue(map.isEmpty());
    }

    @Test
    public void testThatIGetAccurateSizeOfTheList(){
        ArrayList <Integer> list = new ArrayList<>();
        list.add(14);
        list.add(15);
        assertEquals(1, map.size(list));
    }

    @Test
    public void testThatAddMethodWorks(){
        String key = "name";
        String value = "miracle";
        map.add(key, value);
        ArrayList <String> expected = new ArrayList<>();
        expected.add(key);
        expected.add(value);

        assertEquals(expected,map.list);
    }

    @Test
    public void testThatListContainsValue(){
        map.add("name", "miracle");
        map.add("age", "19");
        String user = "miracle";
        assertTrue(map.containsValue(user));
    }

    @Test
    public void testThatListContainsKey(){
        map.add("name", "miracle");
        map.add("age", "19");
        String user = "age";
        assertTrue(map.containsKey(user));
    }

    @Test
    public void testThatWeRetrieveValueByKey(){
        map.add("name", "miracle");
        map.add("age", "19");
        String user = "age";
        assertEquals("19", map.get(user));
    }

    @Test
    public void testThatTheMethodPutWorks(){
        map.add("name", "miracle");
        map.add("age", "19");
        String key = "name";
        String value = "miracle";
        String userKey = "age";
        String secValue = "20";
        ArrayList <String> expected = new ArrayList<>();
        expected.add(key);
        expected.add(value);
        expected.add(userKey);
        expected.add(secValue);

        map.put(userKey, secValue);
        assertEquals(expected, map.list);
    }
}
