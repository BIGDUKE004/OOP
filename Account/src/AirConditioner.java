public class AirConditioner {
    private int tempControl;
    private boolean powerSwitch;

    public void setPowerState(String state) {
        if (state.equalsIgnoreCase("on")) {
            this.powerSwitch = true;
        } else if (state.equalsIgnoreCase("off")) {
            this.powerSwitch = false;
        }
    }

    public boolean isPowerOn() {
        return powerSwitch;
    }
    
    public void increaseTemperature(int temperature) {
        if(temperature >= 16)this.tempControl = temperature;
    }

    public void decreaseTemperature(int temperature) {
        if (temperature <= 30)this.tempControl = temperature - tempControl;
    }
    public int tempChecker(){
        return tempControl;
    }


}
