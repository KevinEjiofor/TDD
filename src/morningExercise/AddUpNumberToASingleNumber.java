package morningExercise;

public class AddUpNumberToASingleNumber {


    public int addToGetOneIndex(int number) {

            int sum = 0;


        while(number > 0 || sum >= 9) {

                if(number == 0) {
                    number = sum;

                    sum = 0;

                }
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

        }
//        int sum = 0;
//        if (number.length() >= 2) {
//
//            for (int i = 0; i < number.length(); i++) {
//
//                char c = number.charAt(i);
//                int numericValue = Character.getNumericValue(c);
//                sum += numericValue;
//
//            }
//
//        }
//
//
//        return  sum;








