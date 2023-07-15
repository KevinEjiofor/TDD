package tdd;

public class DigitalClock {
    private int seconds;
    private int minute;
    private int hour;
    private int day;

    public void convertSecond() {

        seconds = minute * 60;
    }
    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
        if (seconds >= 60 && seconds < 3600){
            this.minute = seconds/60;
            this.seconds = seconds % 60;
        }

    }

        public int getSeconds() {
        return seconds;
     }

    public void convertMinute(){
        if (seconds >= 60){
        minute = seconds/60 ;}

        }
        public void setMinute(int minute) {
        this.minute = minute;
    }
        public int getMinute() {
        return minute;
    }
    public void convertHour() {
        if (minute >= 60){
            hour = minute / 60;}

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour ;
    }

    public void convertDay() {
        if ( hour >= 24 )
        day = hour/24;
    }

    public int getDay() {
        return day;
    }


    }

