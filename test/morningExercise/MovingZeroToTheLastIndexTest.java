package morningExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingZeroToTheLastIndexTest {

    @Test
    public void testMovingZeroToTheLastIndex(){
        MovingZeroToTheLastIndex check = new MovingZeroToTheLastIndex();

        int [] number = {4,-3,0,2,0,4,10,12};

         check.moveZeroIndex(number);

        int [] expected = {4,-3,2,4,10,12,0,0};
        assertArrayEquals(expected,number);
    }

    @Test
    public void testForZero(){
        MovingZeroToTheLastIndex check = new MovingZeroToTheLastIndex();

        int [] number = {4,3,0,0,0,4,10,0};

        check.moveNumberZeroToTheLastIndex(number);

        int [] expected = {4,3,4,10,0,0,0,0};
        assertArrayEquals(expected,number);

    }

}