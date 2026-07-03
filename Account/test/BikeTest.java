import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp(){
        bike = new Bike();
    }

    @Test
    public void bikeStateIsOffAndItGetTurnedOn(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());
    }

    @Test
    public void bikeStateIsOnAndItGetTurnedOff(){
        bike.setIgnition("off");
        assertEquals(false, bike.ignitionState());
    }

    @Test
    public void bikeIsWorkingOnGear1AtTheSpeedOf15_And_IncreasedBy1(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(15);
        bike.increaseSpeed(1);
        assertEquals(16, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear2AtTheSpeedOf24_And_IncreasedBy2(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(24);
        bike.increaseSpeed(2);
        assertEquals(26, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear3AtTheSpeedOf35_And_IncreasedBy3(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(35);
        bike.increaseSpeed(3);
        assertEquals(38, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear4AtTheSpeedOf44_And_IncreasedBy4(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(44);
        bike.increaseSpeed(4);
        assertEquals(48, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear1AtTheSpeedOf15_And_DecreasedBy1(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(15);
        bike.decreaseSpeed(1);
        assertEquals(14, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear2AtTheSpeedOf24_And_DecreasedBy2(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(24);
        bike.decreaseSpeed(2);
        assertEquals(22, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear3AtTheSpeedOf35_And_DecreasedBy3(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(35);
        bike.decreaseSpeed(3);
        assertEquals(32, bike.speedState());
    }

    @Test
    public void bikeIsWorkingOnGear4AtTheSpeedOf44_And_DecreasedBy4(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setSpeedToTestTheIncrementAndDecrement(44);
        bike.decreaseSpeed(4);
        assertEquals(40, bike.speedState());
    }

    @Test
    public void bikejustGotTurnedOnAndIsAboutToGetMovingAndWasPutInGear1(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        for(int count = 0; count <= 15; count++){
            bike.increaseGearState(count);
        }
        assertEquals(1, bike.getGearState());
    }

    @Test
    public void bikeIsMovingOnGear1_And_GotToGear2(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        for(int count = 0; count <= 28; count++){
            bike.increaseGearState(count);
        }
        assertEquals(2, bike.getGearState());
    }

    @Test
    public void bikeIsMovingOnGear2_And_GotToGear3(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        for(int count = 0; count <= 35; count++){
            bike.increaseGearState(count);
        }
        assertEquals(3, bike.getGearState());
    }

    @Test
    public void bikeIsMovingOnGear3_And_GotToGear4(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        for(int count = 0; count <= 45; count++){
            bike.increaseGearState(count);
        }
        assertEquals(4, bike.getGearState());
    }

    @Test
    public void bikeIsMovingOnGear4_And_GotDecreasedToGear3(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());


        bike.decreaseGearState(1);
        assertEquals(3, bike.getGearState());
    }

    @Test
    public void bikeIsMovingOnGear3_And_GotDecreasedToGear2(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setUpGearStateToTestDecrement(3);
        bike.setSpeedToTestTheIncrementAndDecrement(31);
        bike.decreaseGearState(1);
        assertEquals(2, bike.getGearState());
    }

    @Test
    public void bikeIsMovingOnGear2_And_GotDecreasedToGear1(){
        bike.setIgnition("on");
        assertEquals(true, bike.ignitionState());

        bike.setUpGearStateToTestDecrement(2);
        bike.setSpeedToTestTheIncrementAndDecrement(21);
        bike.decreaseGearState(1);
        assertEquals(1, bike.getGearState());
    }

}
