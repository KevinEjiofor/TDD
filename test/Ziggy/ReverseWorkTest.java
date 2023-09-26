package Ziggy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWorkTest {
    @Test

    public void testReverseAndAnotherArray() {
        ReverseWork work = new ReverseWork();

        int[] array = {1, 2, 3, 4, 5};

        int[] array2 = {6, 7, 8};

        ArrayList<Integer> actual = work.reverse(array, array2);
        List<Integer> expected = List.of(5, 4, 3, 2, 1, 8, 7, 6);
        assertIterableEquals(expected, actual);




    }


}