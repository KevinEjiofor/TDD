package assignments;

import java.util.Scanner;

public class Name {
    public String formatName(String fullName) {
        String formattedName = "";

        if (fullName.matches("^\\D+$*")) {

            String[] parts = fullName.split(" ");


            if (parts.length < 3) {

                String firstName = parts[0];
                String lastName = parts[parts.length - 1];
                formattedName = firstName.charAt(0) + "." + " " + lastName;

            } else {
                String firstName = parts[0];
                String middleNameOrInitial = parts[1];
                String lastName = parts[parts.length - 1];

                formattedName = firstName.charAt(0) + "." + middleNameOrInitial.charAt(0) + ". " + lastName;
            }
        }

        return formattedName;
    }

    public int convertToInt(String number) {


        return Integer.parseInt(number.replaceAll("\\D", ""));
    }

    public int convertToIntAndSum(String number) {
        int sum = 0;
        for (int index = 0; index < number.length(); index++) {

            String digitChar = number.charAt(index) + "";
            if (digitChar.matches("[0-9]" )){


                int digit = Integer.parseInt(digitChar);

                sum += digit;
            }else if (digitChar.equals("-")){
                int digit = Integer.parseInt(digitChar);

                sum -= digit;
            }
        }


        return  sum;

    }

}














