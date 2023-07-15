package tdd;

public class Bike {
    private boolean isOn;
    private boolean isOff;

    private int decreaseAcceleration;
    private int speed;
    private int gear;


    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOff(boolean isOff) {
        this.isOff = isOff;
    }

    public boolean getIsOff() {
        return isOff;
    }


    public void increaseAcceleration() {
        if (speed >= 0 && speed <= 20) {
            speed++  ;
            gear = 1;
        }
        if  (speed >=21 && speed <=30){
                   speed = speed + 2;
                   gear = 2;}
        if (speed >= 31 && speed <= 40){
                    speed = speed + 3;
                    gear = 3;}

        if(speed >= 40 && speed <= 200 ){
                speed = speed + 4;
                        gear = 4;}
        }


    public void setAcceleration(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
       return speed;
    }

    public int getGear() {
        return gear;
    }


    public void decreaseAcceleration() {
      if (speed >= 0 && speed <= 20) {
         speed-- ;
        gear = 1;}
        if  (speed >=21 && speed <=30){
        speed = speed - 2;
        gear = 2;}
        if (speed >= 31 && speed <= 40){
        speed = speed - 3;
        gear = 3;}

        if(speed >= 40 && speed <= 200 ){
            speed = speed - 4;
            gear = 4;}

    }
}
