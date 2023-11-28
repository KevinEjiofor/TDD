package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArrayTest {
    @Test

    public void checkSubArray(){
        SubArray test = new SubArray();
        int[] array = {2, 4, 6, 3, 1, 10};

        int [] result = test.findIndicesForLargestSum(array);

        int [] expected = {4,5};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testToGetTheHighestElementWhenAddedTogether(){
        SubArray test = new SubArray();
        int[] array = {2, 4, 6, 3, 1, 10};

        int [] result = test.findElementsForLargestSum(array);

        int [] expected = {1,10};
        assertArrayEquals(expected, result);

    }

    @Test
    public void testForPattern(){

        SubArray test = new SubArray();
        String word = "abcabc";

        boolean isPattern = test.findPattern(word);
        assertTrue(isPattern);


    }

    @Test
    public void testForWrongPattern(){

        SubArray test = new SubArray();
        String word = "adkaka";

        boolean isPattern = test.findPattern(word);
        assertFalse(isPattern);



    }

}