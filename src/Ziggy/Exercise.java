package Ziggy;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public List<Integer> findDuplicates(int... elements) {
        List<Integer> notDuplicate = new ArrayList<>();

        for (int index = 0; index < elements.length; index++) {
            boolean isDuplicate = false;

            for (int index2 = 0; index2 < index; index2++) {
                if (elements[index] == elements[index2]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate && elements[index] >= 1) {
                notDuplicate.add(elements[index]);

            }


        }
        return notDuplicate;

    }
}