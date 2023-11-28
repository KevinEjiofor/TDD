package morningExercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfTenCanBeFoundInTheListTest {
@Test
    public void testToGetTrue(){
    CheckIfTenCanBeFoundInTheList result = new CheckIfTenCanBeFoundInTheList();

    List<Integer> numbers = List.of(50, 10, 90, 16);
   boolean isTrue = result.checkForElementsIfItContainTen(numbers);

   assertTrue(isTrue);
}
@Test
    public void testForValueDoestNotContain(){
    CheckIfTenCanBeFoundInTheList result = new CheckIfTenCanBeFoundInTheList();

    List<Integer> numbers = List.of(50, 20, 90, 16);
    boolean isFalse = result.checkForElementsIfItContainTen(numbers);

    assertFalse(isFalse);

    }

}