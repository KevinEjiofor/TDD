package Assignments;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TestRunTest {
    @Test
    public void testCheckingElement() {
        TestRun check = new TestRun();

        int[] element = {1, 2, 3, 4, 5,6};

        check.sortingElement(element);

        int[] newElement = {2, 1, 4, 3, 6,5};
        assertArrayEquals(newElement, element);


    }

    @Test
    public void testCheckingOddElement(){
        TestRun check = new TestRun();
        int [] element = {45,52,11,33,48,25};

        check.swapOddElement(element);

        int [] newElement = {45,52,33,11,48,25};
        assertArrayEquals(newElement,element);
    }
    @Test
    public void swapFromBack(){
        TestRun check = new TestRun();
        int [] element = {45,52,11,33,48,25};
        int [] newElement = {25,48,33,11,52,45};

        int[] newCheckElement  = check.reverseOfElement(element);

        assertArrayEquals(newElement,newCheckElement);



    }
    @Test
    public void testToRemoveTwoFromEveryOddElement (){
        TestRun check = new TestRun();
        int [] element = {22, 41, 15, 8, 2, 1};
        int [] elementResult =  { 39, 13, -1};

      int [] oddElement =  check.removeOddNumberMinusTwoFromTheOddValue(element) ;

        assertArrayEquals(elementResult,oddElement);


    }
}



