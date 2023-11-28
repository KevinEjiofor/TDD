package morningExercise;

import java.util.List;

public class CheckIfTenCanBeFoundInTheList {

    public boolean checkForElementsIfItContainTen(List<Integer> numbers) {
        int element = 10;

        boolean isFound = false;

        for (Integer number : numbers) {
            if (number.equals(element)){
                isFound = true;
                break;
            }


        }
        return isFound;
    }
}
