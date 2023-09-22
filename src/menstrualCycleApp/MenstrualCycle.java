package menstrualCycleApp;

import Ziggy.CustomerException;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class MenstrualCycle {

    private Date startMenstruation;

    private Date endMenstruation;

    private String userName;
    private String password;

    private    LocalDate ovulationDate;

    private int cycleDays;

   private boolean  isCycleStatus ;



    public MenstrualCycle(String userName, String InputPassword) {
        this.userName = userName;
        this.password = InputPassword;


    }
    public void cycleLength(int days) {

        this.cycleDays = days;
        this.isCycleStatus = false;

    }
    public  boolean cycleLengthStatus() throws CustomerException {
        if (cycleDays >= 21 && cycleDays <= 35) {
         isCycleStatus = true;


        } else {
            isCycleStatus = false;
            throw new CustomerException("Try and see the doctor");
        }

    return isCycleStatus;
    }




    public void startingMenstruation(Date startMenstruationInput) {
        this.startMenstruation = startMenstruationInput;
    }

    public void endingMenstruation(Date endMenstruationInput) {
        this.endMenstruation = endMenstruationInput;
    }

    public Date[] calculateOvulationPeriod() {
        Date[] ovulationDates = new Date[2];

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startMenstruation);


        Calendar ovulationDate1 = (Calendar) calendar.clone();
        ovulationDate1.add(Calendar.DAY_OF_MONTH, cycleDays - 14);
        ovulationDates[0] = ovulationDate1.getTime();

        Calendar ovulationDate2 = (Calendar) calendar.clone();
        ovulationDate2.add(Calendar.DAY_OF_MONTH, cycleDays - 9);
        ovulationDates[1] = ovulationDate2.getTime();

        return ovulationDates;
    }


//    public void calculationOvulationPeriod() throws CustomerException {
//        if (startMenstruation != null && cycleDays > 0) {
//            LocalDate startDate = startMenstruation.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            LocalDate ovulationDay = startDate.plusDays(cycleDays - 14);
//
//        } else {
//            throw new CustomerException("Start date of menstruation and cycle length must be set.");
//        }

//        public Date[] calculateOvulationPeriod() {
//            Date[] ovulationDates = new Date[2];
//
//            Calendar calendar = Calendar.getInstance();
//           calendar.setTime(endMenstruation);
//
//            calendar.add(Calendar.DAY_OF_MONTH, cycleDays - 14);
//            ovulationDates[0] = calendar.getTime();
//
//            calendar.add(Calendar.DAY_OF_MONTH, 5);
//            ovulationDates[1] = calendar.getTime();
//
//            return ovulationDates;

    }








