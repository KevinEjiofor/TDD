package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsLetterTest {
    @Test
    public void testWords(){
        VowelsReverse letter = new VowelsReverse();

        String word = "Leetcode";
        String expected = "Leotcede";

        String expectedLetter =  letter.reverseVowels(word);
        assertEquals(expected, expectedLetter);

    }

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

        String expectedLetter =  vowelsLetter.toReverseVowelsLetter(letter);

        assertEquals(expected, expectedLetter);
    }
}