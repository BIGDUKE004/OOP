import Dairy.Dairies;
import Dairy.Dairy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DairiesTest {

    private Dairies dairies;

    @BeforeEach
    public void setDairies(){
        dairies = new Dairies();
    }

    @Test
    public void testThatIAddADiary(){
        dairies.addDairy("Miracle", "BIGDUKE004");
        assertEquals(1, dairies.getListSize());
    }

    @Test
    public void findDiaryUsingUserName() {
        dairies.addDairy("Miracle", "BIGDUKE004");
        Dairy miracleDairy = (dairies.findDairy("Miracle"));
        miracleDairy.createEntry("Miracle", "A Billionaire");
        assertEquals(1, dairies.getListSize());
        assertEquals(1, miracleDairy.getAmountOfEntries());
    }

    @Test
    public void deleteDairy(){
        dairies.addDairy("Miracle", "BIGDUKE004");
        Dairy miracleDairy = (dairies.findDairy("Miracle"));
        miracleDairy.createEntry("Miracle", "A Billionaire");
        assertEquals(1, dairies.getListSize());
        assertEquals(1, miracleDairy.getAmountOfEntries());
        dairies.delete("Miracle", "BIGDUKE004");
        assertEquals(0, dairies.getListSize());
    }
}
