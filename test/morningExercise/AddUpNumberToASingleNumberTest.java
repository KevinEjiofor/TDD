package morningExercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddUpNumberToASingleNumberTest {
    AddUpNumberToASingleNumber add;
    @BeforeEach
    public void startWith(){
        add = new AddUpNumberToASingleNumber();

    }
   @Test
    public void testAddUpNumberToASingleNumber(){
        int number = 38;

        int result = add.addToGetOneIndex(number);

        int expected = 2;

        assertEquals(expected, result);

    }
    @Test
    public void testAddUpNumber(){
        int number = 0;

        int result = add.addToGetOneIndex(number);

        int expected = 0;

        assertEquals(expected, result);

    }
    @Test
    public void testAddUp(){
        int number = 282;

        int result = add.addToGetOneIndex(number);

        int expected = 3;

        assertEquals(expected, result);

    }

}