package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckForHAshTest {
    @Test
    public void testCheckForHAsh() {
        CheckForHAsh test = new CheckForHAsh();
        String a = "ab#c";
        String b = "ad#c";

       boolean result = test.checkForHash(a, b);

        assertTrue(result);


    }
    @Test
    public void testCheckForHash(){
        CheckForHAsh test = new CheckForHAsh();
        String a = "ab#c";
        String b = "adc";

        boolean result = test.checkForHash(a, b);

        assertFalse(result);

    }

}