package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest  {
    @Test
        public void testingMin () {
        Clock apple = new Clock();
        apple.setMinutes(600/10);

        apple.changeToSecond();

        int time = apple.getSecond();
        assertEquals(60, time);
    }
    @Test
        public void testingSecond () {
        Clock apple = new Clock();
        apple.setSecond(120);

        apple.changeToMinutes();

        int time =apple.getminutes();
        assertEquals(2,time);
    }

    @Test
    public void changeMinToYear(){
        Clock apple = new Clock();
        apple.setMinutes(525600);

        apple.changeToYear();

        int year = apple.getYear();
        assertEquals(1, year);

    }

}

