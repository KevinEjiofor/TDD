package menstrualCycleTest;
import menstrualCycleApp.MenstrualCycle;
import Ziggy.CustomerException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class MenstrualCycleTest {

    private MenstrualCycle cycle;

    @BeforeEach
    public void setUp() {
        cycle = new MenstrualCycle("joy", "bloodFlow");
        cycle.startingMenstruation(new Date(2020, Calendar.FEBRUARY, 3));
        cycle.endingMenstruation(new Date(2020, Calendar.FEBRUARY, 8));
    }

    @Test
    public void testToKnowCycleLengthIsNormal() throws CustomerException {
        cycle.cycleLength(35);
        boolean result = cycle.cycleLengthStatus();
        assertTrue(result);
    }

    @Test
    @DisplayName("Test abnormal cycle length")
    public void testToKnowCycleLengthIsNotNormal() throws CustomerException {
        cycle.cycleLength(19);
        assertThrows(CustomerException.class, () -> cycle.cycleLengthStatus());
    }
    @Test
    public void testToKnowOvulationPeriodDay() throws CustomerException, ParseException {
        cycle.cycleLength(28);
        Date[] dateOfOvulation = cycle.calculateOvulationPeriod();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date expectedStartDate = dateFormat.parse("2020-02-15");
        Date expectedEndDate = dateFormat.parse("2020-02-20");

        assertArrayEquals(new Date[]{expectedStartDate, expectedEndDate}, dateOfOvulation);


    }
}
