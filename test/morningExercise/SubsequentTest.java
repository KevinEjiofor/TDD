package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequentTest {
    @Test

    public  void testSubsequent(){
        Subsequent test = new Subsequent();
        String s = "ace";

        String t = "abcde";

        boolean isTrue = test.isSubsequent(s,t);

        assertTrue(isTrue);
    }

    @Test
    public void testSubsequentIsFalse(){
        Subsequent test = new Subsequent();
        String s = "met";

        String t = "stream";

        boolean isFalse = test.isSubsequent(s,t);
        assertFalse(isFalse);

    }
    @Test
    public void testSubsequentIsTrue(){
        Subsequent test = new Subsequent();
        String s = "stem";

        String t = "Stream";

        boolean isTrue = test.isSubsequent(s,t);
        assertTrue(isTrue);

    }



}