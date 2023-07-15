package tdd;

public class AirCondition {
    private int temperature;
    private boolean isOn;


    public boolean getIsOn() {
        return isOn;
    }
    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void increaseTemperature() {
        if (temperature < 30)
            temperature++ ;
    }



    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void decreaseTemperature() {
        if(temperature > 16 )
            temperature--;


    }
}


