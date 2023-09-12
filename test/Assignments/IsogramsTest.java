package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsogramsTest {
    @Test

    public void checkWord(){
        Isograms word = new Isograms();

        String letters = "qweewwe erert dfgs";


        assertFalse(word.checkEntryToBeIsograms(letters));
    }
    @Test
    public void testIfWordIsIsograms(){
        Isograms word = new Isograms();

        String letters = "qwertyuiopasdfghjklzxcvbnm";


        assertTrue(word.checkEntryToBeIsograms(letters));
    }

    @Test
    public void testIfWordIsIsogramsWithSpecialCharacter(){
        Isograms word = new Isograms();

        String letters = "qwertyuiopasdfghjklzxcvbnm&*^%$";


        assertTrue(word.checkEntryToBeIsograms(letters));
    }

    @Test
    public void testIfWordIsIsogramsWithSpace(){
        Isograms word = new Isograms();

        String letters = "qWertyuio pasdfghjklzxcvbnm&*^%$";


        assertTrue(word.checkEntryToBeIsograms(letters));
    }

}
