import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelAndConsonantCounterTest {

    VowelAndConsonantCounter words;
    @BeforeEach
    public void setUp(){
        words = new VowelAndConsonantCounter();
    }

    @Test
    public void getTheNumberOfVowel_And_ConsonantInAWord(){
        words.getVowelAndConsonant("Hello World");
        int [] expected = {3, 7};
        assertArrayEquals(expected, words.count());
    }


}
