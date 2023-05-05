package Bike;

public class BikeSnacks {
    private boolean isOn;
    private int speed;
    private int gear;
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
        speed = 1;
        gear = 1;
    }
    public void turnOff() {
        isOn = false;
        speed = 0;
    }
    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if(isOn()){
            if(gear == 1){
                speed += 1;
            }
        }
    }

    public int getGear() {
        return gear;
    }
}
