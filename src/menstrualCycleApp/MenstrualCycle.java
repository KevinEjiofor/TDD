package menstrualCycleApp;

import Ziggy.CustomerException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualCycle {

    private final String userName;
    private final String inputPassword;
    private LocalDate startMenstruation;
    private LocalDate endMenstruation;

    private int cycleLength;
    private String  CycleStatus;

    public MenstrualCycle(String userName, String inputPassword) {
        this.userName = userName;
        this.inputPassword = inputPassword;
    }

    public void setCycleLength(int days) {
        this.cycleLength = days;
        this.CycleStatus = " ";
    }

    public String cycleLengthStatus() throws CustomerException {
        if (cycleLength >= 21 && cycleLength <= 35) {
            CycleStatus = "Normal";

        } else {

            throw new CustomerException("Please consult a doctor .");
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
//        String formattedOvulationDate = ovulationDate.format(formatter);
        String formattedStartDate = startOvulationPeriod.format(formatter);
        String formattedEndDate = endOvulationPeriod.format(formatter);

        return formattedStartDate + " " + formattedEndDate;

    }


    public String calculateNextCycle() {

        LocalDate dateMenstruationStart = getEndMenstruation();

        LocalDate menstruationStart = dateMenstruationStart.plusDays(cycleLength);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String formattedStartDate;
        formattedStartDate = menstruationStart.format(formatter);


        return formattedStartDate;
    }
}
