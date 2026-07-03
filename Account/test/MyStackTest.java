import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    private MyStack myStack;

    @BeforeEach
    public void setMyStack(){
       myStack = new MyStack();
    }

    @Test
    public void testThatListIsEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatMethodPushWorks(){
        ArrayList <String> name = new ArrayList<>();
        String word = "miracle is a billionaire, a world renowned CEO";
        name.add(word);
        myStack.push(word);
        assertEquals(name, myStack.stackList);
    }

    @Test
    public void testThatMethodPopWorksEfficiently(){
        ArrayList <String> name = new ArrayList<>();
        String miracle = "a world renowned CEO, solving a problem for tech company's out there, a man who took care of his parent";
        String word = "miracle is a billionaire, a world renowned CEO";
        name.add(word);
        name.add(miracle);
        myStack.push(word);
        myStack.push(miracle);
        assertEquals(miracle, myStack.pop());

    }

    @Test
    public void testThatMethodPeekWorks(){
        ArrayList <String> name = new ArrayList<>();
        String miracle = "a world renowned CEO, solving a problem for tech company's out there, a man who took care of his parent";
        String word = "miracle is a billionaire, a world renowned CEO";
        name.add(word);
        name.add(miracle);
        myStack.push(word);
        myStack.push(miracle);
        assertEquals(word, myStack.peek());
    }

    @Test
    public void testThatMethodSearchWorks(){
        ArrayList <String> name = new ArrayList<>();
        String miracle = "a world renowned CEO, solving a problem for tech company's out there, a man who took care of his parent";
        String word = "miracle is a billionaire, a world renowned CEO";
        name.add(word);
        name.add(miracle);
        myStack.push(word);
        myStack.push(miracle);
        assertEquals(2, myStack.search(miracle));
    }

    @Test
    public void testThatMethodSearchWorksWell(){
        ArrayList <String> name = new ArrayList<>();
        String miracle = "a world renowned CEO, solving a problem for tech company's out there, a man who took care of his parent";
        String word = "miracle is a billionaire, a world renowned CEO";
        String affirmation = "i'm gonna be successful, and build up my own tech company from scratch and scale into a billion dollar venture, investing in other startups and having huge shares in big companies like apple, tesla, space x and the likes...through the help of go i believe i'd achieve this goal and vision of mine";
        name.add(word);
        name.add(miracle);
        name.add(affirmation);
        myStack.push(word);
        myStack.push(miracle);
        myStack.push(affirmation);
        assertEquals(3, myStack.search(miracle));
    }
}
