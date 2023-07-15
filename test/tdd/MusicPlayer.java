package tdd;



public class MusicPlayer {

    private boolean isOn;
    private boolean isOff;
    private String music;
    private boolean isNext;
    private boolean isPrevious;
    private int volume;


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



    public boolean getIsNext() {
        return isNext;
        }

        public void setIsNext(boolean isNext) {
        this.isNext = isNext;
        }


        public boolean getIsPrevious() {
            return isPrevious ;
    }

   public void setIsPrevious(boolean isPrevious) {

        this.isPrevious = isPrevious;
    }




    public void increaseVolume () {
        if(volume < 100)
            volume++;



    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void decreaseVolume() {
        if (volume > 0)
            volume--;

    }


    public void muteVolume() {

    }

    public int getmute() {
        return 0;
    }
}
    
