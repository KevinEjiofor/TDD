package assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChangeStringToIntTest {
    @Test
    public void getTheInt(){
        ChangeStringToInt datatype = new ChangeStringToInt();

        String word = "dfa12321afd";

        int expected = datatype.convertToInt(word);

        assertEquals( 12321, expected);


    }
    @Test
    public void getSecondLargest(){

        ChangeStringToInt datatype = new ChangeStringToInt();

        String word = "dfa12321afd";

        int expected = datatype.convertToInt(word);

        assertEquals( 12321, expected);

        int secondLargest = datatype.findSecondLargest(expected);

        assertEquals(2, secondLargest);

    }

    @Test
    public void getSecondLargestN(){
        ChangeStringToInt datatype = new ChangeStringToInt();

        String word = "eddee1111";

        int expected = datatype.convertToInt(word);

        assertEquals( 1111, expected);

        int secondLargest = datatype.findSecondLargest(expected);

        assertEquals(-1, secondLargest);
    }
}
