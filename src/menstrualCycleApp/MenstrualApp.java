package menstrualCycleApp;

import Ziggy.CustomerException;

import javax.swing.*;
import java.time.LocalDate;


import java.time.format.DateTimeParseException;

public class MenstrualApp {
    private  MenstrualCycle cycles = new MenstrualCycle();
    
    private String userName = " ";


    public static void main(String[] args) {
        MenstrualApp app = new MenstrualApp();
        app.welcomePage();
    }

    public void welcomePage(){
        try {
            String login = inputMethod("""
                        Enter:
                            
                            1->  Menu page
                            
                            2->  Exit App
                            
                           
                            
                                
                            """);
            if (login != null && !login.isEmpty()) {
                switch (login) {


                    case "1" -> createAnAccount();

                    case "2" -> exitApp();


                    default -> throw new CustomerException("Invalid input. Please enter '1 - 2");
                }
            }

        } catch (CustomerException e) {
            displayMethod(e.getMessage());
            welcomePage();
        }

    }

    private void exitApp() {
        try {

            String user = inputMethod("Do you want to EXIT the app? Enter Yes/No: ").toLowerCase();


            switch (user) {
                case "yes" -> displayMethod("Bye !");
                case "no" -> welcomePage();
                default -> throw new IllegalArgumentException("Invalid input. Please enter 'YES / NO'. ");
            }

        }catch (IllegalArgumentException error){
            displayMethod(error.getMessage());
            exitApp();
        }

    }

    private void createAnAccount() {
        try {
            String user = inputMethod("What name do you want to be called:  ");
            validateInputLetter(user);

            userName = user;

            String yearOfBirth = inputMethod("Kindly enter your year of birth : ");
            fourDigitNumber(yearOfBirth);
            displayMethod(
                    "Hello "+ userName + """
                     \n   Welcome to our menstrual cycle tracking app! We're here to help you gain valuable insights into your menstrual cycle and ovulation patterns.s  
                    It's important to remember that while our app provides valuable information and predictions,no method of tracking or predicting your cycle is 
                    foolproof and can guarantee 100% accuracy.
                                        
                    The human body is complex, and menstrual cycles can vary from person to person and even from month to month. 
                    Our app uses data and algorithms to make predictions based on patterns, but there can be natural variations and unexpected factors that influence your cycle.
                                        
                    We encourage you to use this app as a helpful tool for understanding your body and planning various aspects of your life, 
                    such as fertility, period dates, and more. However, always consult with healthcare professionals for important decisions related to your health and family planning.
                                        
                    Remember, our goal is to empower you with knowledge and insights, but your health and well-being are of utmost importance.
                     Use this app as a valuable resource, but make informed decisions based on your unique circumstances.
                                        
                    Thank you for choosing our app, and we're here to support you on your journey of self-awareness and health management."
                    """);
            menuPage();

        } catch (CustomerException e) {
            displayMethod(e.getMessage());
            welcomePage();
        }
    }

    private void menuPage() throws CustomerException {

        try {


            String menu = inputMethod("""

                    Enter:
                            1-> Cycle Status

                            2-> Next Menstrual Period

                            3-> Ovulation Period
                            
                            4-> period status
                            
                            5-> Home Page

                    """);
            if (menu != null && !menu.isEmpty()) {
                switch (menu) {
                    case "1" -> cyclesStatus();

                    case "2" -> nextMenstrual();

                    case "3" -> OvulationPeriod();

                    case "4" -> period();
                    
                    case "5" -> backToHome();

                    default -> throw new CustomerException("Invalid input. Please enter '1 - 5'");
                }
            } else {
                throw new CustomerException("Invalid input. Please enter '1 - 5'");

            }


        }catch (CustomerException error){
            displayMethod(error.getMessage());
        }
    }

    private void backToHome() throws CustomerException {
        welcomePage();
    }

    private void period() throws CustomerException {
        String startMenstruationStr = inputMethod("when did you start menstruation (\"yyyy-MM-dd\"): ");
        dateFormatValidation(startMenstruationStr);

        String endMenstruationStr = inputMethod("when did you stop your menstruation (\"yyyy-MM-dd\"): ");
        dateFormatValidation(endMenstruationStr);

        LocalDate startMenstruation = LocalDate.parse(startMenstruationStr);
        LocalDate endMenstruation = LocalDate.parse(endMenstruationStr);
        cycles.periodLengthStatus(startMenstruation, endMenstruation);
    }

    private void OvulationPeriod() throws CustomerException {
        try {
            displayMethod("""
                    The menstrual cycle refers to several hormonal changes that occur as a female's body prepares for pregnancy. \s
                    A full menstrual cycle begins on the first day of a period and ends the day before the next period.
                    """);


            String startMenstruationStr = inputMethod("when did you start menstruation (\"yyyy-MM-dd\"): ");
            dateFormatValidation(startMenstruationStr);

            String endMenstruationStr = inputMethod("when did you stop your menstruation (\"yyyy-MM-dd\"): ");
            dateFormatValidation(endMenstruationStr);

            LocalDate startMenstruation = LocalDate.parse(startMenstruationStr);
            LocalDate endMenstruation = LocalDate.parse(endMenstruationStr);

            cycles.setStartMenstruation(startMenstruation);
            cycles.setEndMenstruation(endMenstruation);


            displayMethod(
                    """
                    What is cycle length ?
                    The menstrual cycle is counted from the first day of one period to the first day of the next.
                    The cycle isn't the same for everyone. Menstrual bleeding might happen every 21 to 35 days and last 2 to 7 days.
                    For the first few years after menstruation begins, long cycles are common.

                    For instance, if you got your period on June 5 and your next period came on July 2,
                    your cycle length was 27 days that month
                    """);

            String cycle = inputMethod("Kindly enter your last cycle length: ");

            cycles.setCycleLength(Integer.parseInt(cycle));


            displayMethod("""
                    Ovulation is the release of an egg from the ovaries. A woman is born with all her eggs.
                    Once she starts her periods, 1 egg develops and is released during each menstrual cycle.
                    Pregnancy happens if a man's sperm meet and fertilise the egg. Sperm can survive in the fallopian\s
                    tubes for up to 7 days after sex.
                    """);

            String ovulationPeriod = cycles.calculateOvulationPeriod();

            displayMethod(userName + "your ovulation period is from: "+ ovulationPeriod);
        }catch (DateTimeParseException e) {
            displayMethod("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            menuPage();
        } catch (CustomerException | IllegalArgumentException e){
            displayMethod(e.getMessage());
            menuPage();

        }


    }

    private void nextMenstrual() throws CustomerException {
        try {
            displayMethod("""
                    The menstrual cycle refers to several hormonal changes that occur as a female's body prepares for pregnancy or not. \s
                    A full menstrual cycle begins on the first day of a period and ends the day before the next period.
                    """);


            String startMenstruationLast = inputMethod("when did you start your last menstruation (\"yyyy-MM-dd\"): ");
            dateFormatValidation(startMenstruationLast);

            String endMenstruationLast = inputMethod("when did your last menstruation stop (\"yyyy-MM-dd\"): ");
            dateFormatValidation(endMenstruationLast);

            displayMethod("""
                    What is cycle length ?
                    The menstrual cycle is counted from the first day of one period to the first day of the next.
                    The cycle isn't the same for everyone. Menstrual bleeding might happen every 21 to 35 days and last 2 to 7 days.
                    For the first few years after menstruation begins, long cycles are common.

                    For instance, if you got your period on June 5 and your next period came on July 2,
                    your cycle length was 27 days that month
                    """);

            int cycleLength = Integer.parseInt(inputMethod("Kindly enter your cycle length: "));

            LocalDate startMenstruation = LocalDate.parse(startMenstruationLast);
            LocalDate endMenstruation = LocalDate.parse(endMenstruationLast);

            cycles.setStartMenstruation(startMenstruation);
            cycles.setEndMenstruation(endMenstruation);
            cycles.setCycleLength(cycleLength);

            String result = cycles.calculateNextCycle();


            displayMethod(
                    userName + " your next menstruation should be " + result );
            menuPage();


        }catch (DateTimeParseException | CustomerException | IllegalArgumentException e) {

            displayMethod("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            displayMethod(e.getMessage());
            menuPage();
}



    }

    private void cyclesStatus() throws CustomerException {

        try{
            displayMethod("""
                    What is cycle length ?
                    The menstrual cycle is counted from the first day of one period to the first day of the next.
                    The cycle isn't the same for everyone. Menstrual bleeding might happen every 21 to 35 days and last 2 to 7 days.
                    For the first few years after menstruation begins, long cycles are common.

                    For instance, if you got your period on June 5 and your next period came on July 2,
                    your cycle length was 27 days that month
                    """);

             String cycle =inputMethod("Kindly enter your cycle length: ");

             cycles.setCycleLength(Integer.parseInt(cycle));
             String status = cycles.cycleLengthStatus();

             displayMethod( userName + " your Cycle length is  "+ status);
             menuPage();

        }catch (IllegalArgumentException |CustomerException error){
            displayMethod(error.getMessage());
            menuPage();
        }
    }
    private void dateFormatValidation(String dateFormat) throws CustomerException {
        String dateRegex = "^\\d{4}-\\d{2}-\\d{2}$";
        if(!dateFormat.matches(dateRegex)){throw new CustomerException("Invalid entry");}


    }

    private void validateInputLetter(String letter) throws CustomerException {
        String pattern = "^\\D+$*";

        if (!letter.matches(pattern)) throw new CustomerException("Invalid entry");
    }
    private void fourDigitNumber(String input) throws CustomerException {
        String pattern = "\\d{4}";

        if (!input.matches(pattern)) throw new CustomerException("Invalid year of birth");
    }
    private void validateNumbers(String numbers) throws CustomerException {

        String pattern = "^[\\d\\W]+$";
        if (!numbers.matches(pattern)) throw new CustomerException("invalid entry");
    }

    private String inputMethod(String prompt){return JOptionPane.showInputDialog(null,prompt);}

    private void displayMethod(String prompt){
        JOptionPane.showMessageDialog(null, prompt);
    }


   
}
