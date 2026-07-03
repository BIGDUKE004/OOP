public class Bike {
    final private String name = "Honda";
    final private String model = "Honda CBR1000RR-R Fireblade SP";
    private boolean ignition;
    private int gear;
    private int speed;

    public void setIgnition(String igniteEngine) {
        if(igniteEngine.equalsIgnoreCase("on")){
            this.ignition = true;
        } else if (igniteEngine.equalsIgnoreCase("off")){
            this.ignition = false;
        }
    }

    public boolean ignitionState() {
        return ignition;
    }

    public void setSpeedToTestTheIncrementAndDecrement(int setSpeed){
        this.speed = speed + setSpeed;
    }

    public void increaseSpeed(int incrementOfSpeed) {
        this.speed = speed + incrementOfSpeed;
    }

    public int speedState() {
        return speed;
    }

    public void decreaseSpeed(int decrementOfSpeed) {
        this.speed = speed - decrementOfSpeed;
    }

    public void increaseGearState(int increaseGear) {
        if (increaseGear >= 0 && increaseGear <= 20){
            gear = 1;
        } else if (increaseGear >= 21 && increaseGear <= 30){
            gear = 2;
        }else if (increaseGear >= 31 && increaseGear <= 40){
            gear = 3;
        }else if (increaseGear >= 41){
            gear = 4;
        }
    }

    public int getGearState(){
        return gear;
    }

    public void decreaseGearState(int decreaseGear){
        if(decreaseGear >= 41) {
            this.gear = Math.abs(gear - 3);
        } else if (decreaseGear >= 31 && decreaseGear <= 40){
            this.gear = Math.abs(gear - 2);
        } else if (decreaseGear >= 21 && decreaseGear <= 30){
            this.gear = Math.abs(gear - 1);
        } else {
            this.gear = Math.abs(gear - 1);
        }

    }


    public void setUpGearStateToTestDecrement(int addGear){
        this.gear = addGear;
    }

}
