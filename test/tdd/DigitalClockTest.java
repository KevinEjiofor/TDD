package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalClockTest {
    @Test
    public void testSec() {
        DigitalClock rolex = new DigitalClock();
        rolex.setSeconds(3660);

        rolex.convertSecond();

        int checkSec = rolex.getSeconds();
        assertEquals(60, checkSec);
    }


    @Test
    public void secondTest() {
        DigitalClock rolex = new DigitalClock();
        rolex.setMinute(64);

        rolex.convertSecond();

     //   int checkHour = rolex.getHour();
       // assertEquals(1, checkHour);

        int checkMin = rolex.getMinute();
        assertEquals(1, checkMin);

        int checkSecond = rolex.getSeconds() ;
        assertEquals(4, checkSecond);



    }

        @Test
            public void hourTesting () {
                DigitalClock rolex = new DigitalClock();
                rolex.setMinute(120);

                rolex.convertHour();

                int checkHour = rolex.getHour();
                assertEquals(2, checkHour);
        }
        @Test
            public void timeTest () {
                DigitalClock rolex = new DigitalClock();
                rolex.setHour(24);

                rolex.convertDay();

                int checkDay = rolex.getDay();
                assertEquals(1, checkDay);
        }
        @Test
        public void checkMin () {
            DigitalClock rolex = new DigitalClock();

            rolex.setMinute(60);

            rolex.convertHour();

            int checkHour = rolex.getHour();
            assertEquals(1, checkHour);
            int checkMin = rolex.getMinute();
            assertEquals(0, checkMin);


        }
    }


