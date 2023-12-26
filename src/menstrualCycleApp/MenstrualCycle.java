package menstrualCycleApp;

import Ziggy.CustomerException;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class MenstrualCycle {

    private String userName;
    private String inputPassword;

    private LocalDate startMenstruation;
    private LocalDate endMenstruation;

    private int cycleLength;
    private String  CycleStatus;



    public void  register(String userName, String inputPassword) {
        this.userName = userName;
        this.inputPassword = inputPassword;
    }

    public void setCycleLength(int days) {
        this.cycleLength = days;
        this.CycleStatus = " ";
        if (cycleLength <= 0) {
            throw new IllegalArgumentException("Invalid cycle length. Please set a positive value for cycleLength.");



        }
    }



    public String cycleLengthStatus() throws CustomerException {
        if (cycleLength >= 21 && cycleLength <= 35) {
            CycleStatus = "Normal";

        } else {

            throw new CustomerException("This is NOT NORMAL \n Kindly consult a doctor .");
        }
        return CycleStatus;
    }

    public void setStartMenstruation(LocalDate startMenstruation) {
        this.startMenstruation = startMenstruation;
    }

    public LocalDate getStartMenstruation() {
        return startMenstruation;
    }

    public LocalDate getEndMenstruation() {
        return endMenstruation;
    }

    public void setEndMenstruation(LocalDate endMenstruation) {
        this.endMenstruation = endMenstruation;
    }


    public String calculateOvulationPeriod(){

        LocalDate dateMenstruationStarted = getStartMenstruation();

        int halfOfCycle = cycleLength / 2;

        LocalDate ovulationDate = dateMenstruationStarted.plusDays(halfOfCycle);

        LocalDate startOvulationPeriod = ovulationDate.minusDays(2);
        LocalDate endOvulationPeriod = ovulationDate.plusDays(2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedStartDate = startOvulationPeriod.format(formatter);
        String formattedEndDate = endOvulationPeriod.format(formatter);

        return formattedStartDate + " - " + formattedEndDate;

    }






    public String calculateNextCycle() {
        String formattedStartDate;
        LocalDate dateMenstruationStart = getEndMenstruation();

        LocalDate nextMenstruationStart = dateMenstruationStart.plusDays(cycleLength);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        formattedStartDate = nextMenstruationStart.format(formatter);

        return formattedStartDate;
    }



    public String periodLengthStatus(LocalDate startMenstruation, LocalDate endMenstruation) throws CustomerException {
        long periodLength = ChronoUnit.DAYS.between(startMenstruation, endMenstruation);

        if (periodLength <= 0 || periodLength > 7) {
            throw new CustomerException("This is NOT NORMAL \n Please consult a doctor.");
        } else {
            return "Normal";
        }
    }

}
