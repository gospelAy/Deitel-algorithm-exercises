package chapterThree;

public class Airconditional {
    private boolean isOn;
    private int temperature = 16;


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }


    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        temperature ++;

        if (temperature >= 30) temperature = 30;



    }

    public void decreaseTemperature() {
        temperature --;
        if (temperature <= 16) temperature = 16;
    }
}
