package menstrualCycleTest;

import Ziggy.CustomerException;
import menstrualCycleApp.MenstrualCycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualCycleTest {
    MenstrualCycle cycle;
    @BeforeEach
    public void startWith(){
       cycle = new MenstrualCycle();
        cycle.register("User", "Password1");
    }

    @Test
    public void testCycleLengthStatus_ValidCycleLength() throws CustomerException {

        cycle.setCycleLength(28);

        String check = cycle.cycleLengthStatus();

        assertEquals("Normal", check);
    }

    @Test
    public void testCycleLengthStatus_InvalidCycleLength() {
        cycle.setCycleLength(40);
        assertThrows(CustomerException.class, cycle::cycleLengthStatus);
    }





    @Test
    public void testCalculateOvulationPeriod() {

            LocalDate startMenstruation = LocalDate.of(2023, 11, 2);
            LocalDate endMenstruation = LocalDate.of(2023, 11, 7);
            cycle.setStartMenstruation(startMenstruation);
            cycle.setEndMenstruation(endMenstruation);

            cycle.setCycleLength(28);

            String ovulationPeriod = cycle.calculateOvulationPeriod();


            String expectedOvulationPeriod = "Nov 14, 2023 Nov 18, 2023";

            assertEquals(expectedOvulationPeriod, ovulationPeriod);
        }
        @Test
        public void testForNextMenstruationDate(){


            LocalDate startMenstruation = LocalDate.of(2023, 11, 2);
            LocalDate endMenstruation = LocalDate.of(2023, 11, 7);
            cycle.setStartMenstruation(startMenstruation);
            cycle.setEndMenstruation(endMenstruation);

            cycle.setCycleLength(28);

            String calculateNextCycle = cycle.calculateNextCycle();

            String expectedMenstruationDateToStart = "Dec 05, 2023";

            assertEquals(expectedMenstruationDateToStart,calculateNextCycle);



        }






    }

