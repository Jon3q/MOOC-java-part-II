package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private int param;
    private boolean isOn;
    public TemperatureSensor(){
        setOff();
    }

    public boolean isOn(){
        return this.isOn;
    }
    public void setOn(){
        this.isOn = true;
    }      // sets the sensor on
    public void setOff(){
        this.isOn = false;
    }    // sets the sensor off
    public int read(){
        if (isOn == true) {
            this.param = new Random().nextInt(61)-30;
            return this.param;
        } else {
            throw new IllegalStateException("The sensor is OFF");
        }
    }

}
