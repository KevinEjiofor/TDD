package tdd;

public class Clock {
    private  int year;


    private int second;
    private int minutes;

    public void changeToSecond() {
        if (minutes >= 0) {
            second = minutes * 60;
        }
    }

        public void setMinutes (int minutes){
            this.minutes = minutes;
        }

        public int getSecond() {
            return second;

    }



    public void changeToMinutes() {
        minutes = second/60;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public int getminutes() {
        return minutes;
    }

    public void changeToYear() {
        if (minutes >= 525600)
        year = minutes / 525600;
    }

    public int getYear() {
        return year;
    }
}


