package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    public void testWords(){
        ReverseString test = new ReverseString();

        String word = "A better place";
        String assertWord  = String.valueOf(test.reverseWords(word));

        String expected = "A retteb ecalp";

        assertEquals(expected, assertWord);
    }

}