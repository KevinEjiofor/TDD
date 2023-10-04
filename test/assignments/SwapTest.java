package assignments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwapTest {
    @Test
    public void swappingElementIndexTwoAndFour() {
        Swapping check = new Swapping();

        int[] element = {5, 2, -6, 10, 9, 3};

        check.swapElementIndexTwoAndFour(element);

        int[] newElement = {5, 2, 9, 10, -6, 3};
        Assertions.assertArrayEquals(newElement, element);
    }
    @Test
    public void testElementToAssignStringToArray() {
        Swapping check = new Swapping();
        String word = "kissdry";

        int [] index = {6, 2, 3, 4, 1, 0, 5};

       String element = check.resetIndexOfWord(word,index);

       String expected = "yssdikr";

       Assertions.assertEquals(expected, element);
    }

    @Test
    public void testToGetTheFrequencyNumber(){

        Swapping check = new Swapping();

        int [] index = {3, 2, 3};

        int element = check.highestFrequencyNumber(index);

        int frequency = 3;

        Assertions.assertEquals(frequency,element);

    }
    @Test
    public void testToGetTheHighestFrequencyNumber(){

        Swapping check = new Swapping();

        int [] index = {2, 2, 2, 1,1,1,2,2};

        int element = check.highestFrequencyNumber(index);

        int frequency = 2;

        Assertions.assertEquals(frequency,element);

    }
}
