package tdd;

public class Television {
    public Object channelUp;
    private boolean isOn;
    private boolean isOff;
    private int volume;
    private int channel;


    public void isOn() {

    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public boolean getOn() {
        return isOn;
    }
    public void setOff(boolean isOff) {
        this.isOff = isOff;
    }
    public boolean getOff() {
        return isOff;
    }

    public void increaseVolume() {
        if (volume < 100)
            volume++;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void decreaseVolume() {
        if (volume < 0)
            volume--;
    }




    public void channelUp() {
        channel++ ;

    }
    public void setChannel( int channel) {
        this.channel = channel;
    }
    public int getChannel() {
        return channel;
    }

    public void channelDown() {
        channel --;
    }
}

   
