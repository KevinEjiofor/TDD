package Assignments;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapTest {
    @Test
    public void swappingElementIndexTwoAndFour() {
        Swapping check = new Swapping();

        int[] element = {5, 2, -6, 10, 9, 3};

        check.swapElementIndexTwoAndFour(element);

        int[] newElement = {5, 2, 9, 10, -6, 3};
        assertArrayEquals(newElement, element);
    }
}
