package Assignments;

import java.util.Scanner;

public class StudentGrade {
    private final Scanner input = new Scanner(System.in);
    private  int numberOfStudent;
    private  int numberOfSubject;
    String [][] markInput;





   public static void main(String[] args) throws InterruptedException {
       StudentGrade studentGrade = new StudentGrade();
            studentGrade.EntryCollection();
       System.out.println("=".repeat(20* studentGrade.numberOfSubject));



    }

        public  void EntryCollection()  throws InterruptedException{
             System.out.println("How many student do you have? ");
             int numberOfStudent = input.nextInt();


            System.out.println("How many subject do they offer? ");
            int numberOfSubject = input.nextInt();

            if (numberOfStudent > 0 && numberOfSubject > 0) {
                this.numberOfStudent = numberOfStudent;
                this.numberOfSubject = numberOfSubject;
                markCollector();


            }
            else{
                System.out.println("invalid input, try again");
            EntryCollection();}


        }
        public void markCollector () throws InterruptedException {
                String [][] mark = new String[numberOfStudent + 3][numberOfSubject];
                int sumInput [] = new int [numberOfSubject - 1] ;
                int sum = 0;

                for (int index = 0; index < mark.length - 3 ; index++) {
                    for (int index2 = 0; index2 < mark[index].length - 1; index2++) {

                        System.out.printf("%nEntering score for student %d%nEntering score for subject %d%n ",index + 1 , index2 + 1);
                        int score = input.nextInt();
                        mark[index][index2] = String.valueOf(score);
                        if (score >= 0 & score <= 100) {
                            loading();
                           sum += score;
                            double average = (double) sum/numberOfSubject;

                            mark[index][numberOfSubject -3] = String.valueOf(sum);
                            mark[index][numberOfSubject -2] = String.valueOf(average);

                        } else {
                            System.out.println("invalid entry");

                        }
                    }
                }
                markInput = mark;
        }

        public void loading() throws InterruptedException {

            System.out.println("Saving");
            for(int index = 0; index < 30; index++)   {
                System.out.print(">");
                Thread.sleep(30);
            }
                System.out.println("\nSaved successfully");

        }
        public void  tableHead(){
        for (int index = 0; index < markInput[0].length; index++){
            System.out.printf("%10s", markInput[0][index]);
            }
        }
        public void tableBody(){

            markInput[0][0] = "Student";
            for (int index = 0; index  < numberOfSubject; index++){
                markInput[0][index] = "sub" + index;


            }
            for (int index = 0; index  < numberOfSubject; index++){
                markInput[index][0] = "Student" + index;

            }
            markInput[0][numberOfSubject -3]= "Tot";
            markInput[0][numberOfSubject -2]= "AVG";
            markInput[0][numberOfSubject -1]= "Pos";

        }
        public void position(){



        }



}
