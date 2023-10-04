package assignments;

import Ziggy.CustomerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test

    public void testNameInput() throws CustomerException {
        Name testName = new Name();

        String name = "Grace Chigozien Martins";

       String nameEntry = testName.formatName(name);

        String  expected = "G.C. Martins";

        assertEquals(expected, nameEntry);
    }

    @Test
    public void testTwoNameInput() throws CustomerException {
        Name testName = new Name();

        String name = "Grace Martins";

        String nameEntry = testName.formatName(name);

        String  expected = "G. Martins";

        assertEquals(expected, nameEntry);
    }

    @Test
    public void testAddAllNumberInAString(){
        Name testName = new Name();

        String number = "A12BCkdt59";

        int num = testName.convertToInt(number);

        int expected = 1259;

        assertEquals(expected, num);

    }

    @Test
    public void testToGetTheSum(){
        Name testName = new Name();


        String number = "A12B12Ckdt59";

        int num = testName.convertToIntAndSum(number);

        int expected = 20;

        assertEquals(expected, num);

    }
}