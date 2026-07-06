package Dairy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    private Dairy dairy;
    @BeforeEach
    public void setDairy(){
        dairy = new Dairy("Miracle", "BIGDUKE004");
    }

    @Test
    public void dairyIsLockedAndItGetUnlocked(){
        assertFalse(dairy.unLockDairy("BIGDUKE004"));
    }

    @Test
    public void dairyIsUnLockedAndILockIt(){
        assertTrue(dairy.lockDairy());
    }

    @Test
    public void dairyIsUnlockedAndICreateAnEntry(){
        assertFalse(dairy.unLockDairy("BIGDUKE004"));
        dairy.createEntry("myDream", "Become a world renowned CEO");
        assertEquals(1, dairy.getAmountOfEntries());
    }

    @Test
    public void dairyIsUnlockedAndIHaveAnEntryNowIDeleteThatEntry(){
        assertFalse(dairy.unLockDairy("BIGDUKE004"));
        dairy.createEntry("myDream", "Become a world renowned CEO");
        dairy.createEntry("java", "my love");
        assertEquals(2, dairy.getAmountOfEntries());
        dairy.deleteEntry(1001);
        assertEquals(1, dairy.getAmountOfEntries());
    }

    @Test
    public void dairyIsUnlockedAndIHaveAnEntryNowIFindItUsingItId(){
        assertFalse(dairy.unLockDairy("BIGDUKE004"));
        dairy.createEntry("myDream", "Become a world renowned CEO");
        Entry entry = dairy.findEntry(1000);
        assertEquals("myDream", entry.getTitle());
    }

    @Test
    public void dairyIsUnlockedAndIHaveAnEntryNowIFindItUsingItIdThatIsNotValid(){
        assertFalse(dairy.unLockDairy("BIGDUKE004"));
        dairy.createEntry("myDream", "Become a world renowned CEO");
        assertThrows(IllegalArgumentException.class, () -> dairy.findEntry(1001));
    }

    @Test
    public void dairyIsUnlockedAndIHaveAnEntryNowIUpdateTheEntry(){
        assertFalse(dairy.unLockDairy("BIGDUKE004"));
        dairy.createEntry("myDream", "Become a world renowned CEO");
        dairy.updateEntry(1000, "myDream -> would come true", "Become a world renowned CEO");
        Entry entry = dairy.findEntry(1000);
        assertEquals("myDream -> would come true", entry.getTitle());
    }
}
