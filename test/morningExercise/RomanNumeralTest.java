package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    public void testRomanNumeralValue(){
        RomanNumeral test = new RomanNumeral();

        int value = 3500;

        String romanValue = test.getRomanNumeralValue(value);

        String expected = "MMMD";

        assertEquals(expected, romanValue);



    }


}