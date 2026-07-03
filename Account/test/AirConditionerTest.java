import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {
    public AirConditioner AirCon;

    @BeforeEach
    public void setUp(){
        AirCon = new AirConditioner();
    }

   @Test
    public void iTurnOnAcThatIsNotWorking(){
       AirCon.setPowerState("on");
       assertTrue(AirCon.isPowerOn());

   }
    @Test
    public void iTurnOffAcThatIsWorking(){
        AirCon.setPowerState("off");
        assertFalse(AirCon.isPowerOn());

    }
    @Test
    public void temperatureGotIncreased(){
       AirCon.increaseTemperature(24);
       assertEquals(24, AirCon.tempChecker());
    }
    @Test
    public void temperatureGotDecreased(){
        AirCon.decreaseTemperature(30);
        assertEquals(30, AirCon.tempChecker());
    }
    @Test
    public void decreaseAirConditionerMoreThan30_And_ItStillStaysAt30(){
        AirCon.decreaseTemperature(31);
        assertEquals(0, AirCon.tempChecker());
    }
    @Test
    public void increaseAirConditionerMoreThan16_And_ItStillStaysAt16(){
        AirCon.increaseTemperature(15);
        assertEquals(0,AirCon.tempChecker());
    }
}
