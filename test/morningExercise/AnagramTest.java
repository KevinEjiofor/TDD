package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void testAnagram() {
        Anagram  word = new Anagram();
        String s = "anagram";
        String t = "nagaram";

        boolean isAnagram =  word.checkAnagram(s,t);

        assertTrue(isAnagram);
    }

    @Test
    public void testIfIsAnAnagram(){

        Anagram  word = new Anagram();
        String s = "chair";
        String t = "cheer";

        boolean isAnagram =  word.checkAnagramWithSort(s,t);

        assertFalse(isAnagram);

    }

}