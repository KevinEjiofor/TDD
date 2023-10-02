package assignments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

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
}
