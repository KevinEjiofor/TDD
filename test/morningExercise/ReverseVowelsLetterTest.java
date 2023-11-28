package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsLetterTest {

    @Test
    public void testToReverseVowelsLetter(){

        ReverseVowelsLetter vowelsLetter = new ReverseVowelsLetter();


        String letter = "HELLO";
        String expected = "HOLLE";

        String expectedLetter = vowelsLetter.toReverseVowelsLetter(letter);

        assertEquals(expected, expectedLetter);

    }
    @Test
    public void testAnotherWord(){

        ReverseVowelsLetter vowelsLetter = new ReverseVowelsLetter();

        String letter = "Leetcode";
        String expected = "Leotcede";

        String expectedLetter = vowelsLetter.toReverseVowelsLetter(letter);

        assertEquals(expected, expectedLetter);






    }
}