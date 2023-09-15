package assignments;
import java.util.Objects;
import java.util.Scanner;

public class Nokia {
    private static final Scanner input = new Scanner(System.in);

    public static void Phone_Book() {
        System.out.print("""
                \n
                =====================================================
                                     Phone book
                =====================================================
                1. Search
                2. Service Nos. 1
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. Send b’card
                8. Options
                9. Speed dials
                10. Voice tags
                11. Back
                                 
                """);

        System.out.println("Enter menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Search();
        }
        if (Objects.equals(select, "2")) {
            Service();
        }
        if (Objects.equals(select, "3")) {
            AddName();
        }
        if (Objects.equals(select, "4")) {
            Erase();
        }
        if (Objects.equals(select, "5")) {
            Edit();
        }
        if (Objects.equals(select, "6")) {
            AssignTone();
        }
        if (Objects.equals(select, "7")) {
            Send();
        }
        if (Objects.equals(select, "8")) {
            Options();
        }
        if (Objects.equals(select, "9")) {
            SpeedDials();
        }
        if (Objects.equals(select, "10")) {
            VoiceTags();
        }
        if (Objects.equals(select, "11")) {
            Menu();
        } else
            Phone_Book();
    }

    public static void Search() {
        System.out.print("""
                ==========================================
                                Search
                ==========================================
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }

        if (Objects.equals(select, "00")) {
            Menu();
        } else {
            Search();
        }

    }

    public static void Service() {
        System.out.print("""
                *********************************************
                            Service Nos. 1
                *********************************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Service();

    }

    public static void AddName() {
        System.out.print("""
                ***********************************
                            Add name
                ***********************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            AddName();
    }

    public static void Erase() {
        System.out.print("""
                ************************************
                                Erase
                ************************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Erase();

    }

    public static void Edit() {
        System.out.print("""
                ****************************************
                                   Edit
                ****************************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Edit();
    }

    public static void AssignTone() {
        System.out.print(
                """
                        ************************************
                                       Assign tone
                        ************************************
                            1. Back
                            00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            AssignTone();
    }

    public static void Send() {
        System.out.print("""
                ***************************************
                            Send b’card
                ***************************************
                 1. Back
                 00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Send();

    }

    public static void Options() {
        System.out.print("""
                                    
                ===================================
                                Options
                ====================================
                1. Type of view
                2. Memory status
                3. Back
                00. Main Menu""");

        System.out.println("\nEnter menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Type();
        }
        if (Objects.equals(select, "2")) {
            MemoryStatus();
        }
        if (Objects.equals(select, "3")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Options();
    }

    public static void Type() {
        System.out.print("""
                 *********************************
                            Type of view
                 *********************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter menu number: ");
        String select = input.next();

        if (Objects.equals(select, "1")) {
            Options();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Type();


    }

    public static void MemoryStatus() {
        System.out.print("""
                **********************************
                           Memory status
                **********************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter menu number: ");
        String select = input.next();

        if (Objects.equals(select, "1")) {
            Options();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            MemoryStatus();
    }

    public static void SpeedDials() {
        System.out.print("""
                *******************************
                            Speed dials
                *******************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            SpeedDials();
    }

    public static void VoiceTags() {
        System.out.print("""
                ***********************************
                            Voice tags
                ***********************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Phone_Book();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            VoiceTags();

    }

    public static void Message() {
        System.out.print("""
                **********************************
                            Message
                **********************************
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10.Service command editor
                11. Back""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            WriteMessages();
        }
        if (Objects.equals(select, "7")) {
            Message_settings();
        }
        if (Objects.equals(select, "8")) {
            InfoService();
        }
        if (Objects.equals(select, "9")) {
            Voice_Mailbox();
        }
        if (Objects.equals(select, "10")) {
            ServiceCommand();
        }
        if (Objects.equals(select, "11")) {
            Menu();
        } else
            Message();
    }

    public static void WriteMessages() {
        System.out.print("""
                *********************************
                        Write messages
                *********************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Message();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            WriteMessages();
    }

    public static void Message_settings() {
        System.out.print("""
                 ********************************
                         Message settings
                 ********************************
                1. Set 12
                2. Common 3
                3. Back
                 00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Set();
        }
        if (Objects.equals(select, "2")){Common();}
        if (Objects.equals(select, "3")) {
            Message();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else
            Message_settings();
    }

    public static void Set() {
        System.out.print("""
                ************************************
                               Set
                ************************************
                1. Message centre number
                2. Messages sent as
                3. Message validity
                4. Back""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {Message_centre();}
        if (Objects.equals(select, "2")){Messages_sent();}
        if (Objects.equals(select, "3")){Message_validity();}
        if(Objects.equals(select, "4")){Message_settings();}
        else
            Set();

    }

        public static void Message_centre() {
            System.out.print("""
                    ********************************
                        Message centre number
                    ********************************
                    1. Back
                    00. Main Menu""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if (Objects.equals(select, "1")) {
                Set();
            }
            if (Objects.equals(select, "00")) {
                Menu();
            } else {
                Message_centre();
            }

        }

        public static  void Messages_sent(){
            System.out.print("""
                            ********************************
                                  Message centre number
                            ********************************
                                        1. Back
                                        00. Main Menu""");
            System.out.println("\\nEnter  menu number: ");
            String select = input.next();
            if (Objects.equals(select, "1")) {Set();}
            if (Objects.equals(select, "00")) {Menu();}
            else {Message_settings();}



        }

        public static void Message_validity(){
            System.out.print("""
                            ********************************
                                  Message centre number
                            ********************************
                                        1. Back
                                        00. Main Menu""");
            System.out.println("\\nEnter  menu number: ");
            String select = input.next();
            if (Objects.equals(select, "1")) {Set();}
            if (Objects.equals(select, "00")) {Menu();}
            else {Message_validity();}

        }

        public static  void Common(){
            System.out.print("""
                    *********************************
                                 Common
                    *********************************
                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
                    4. Back
                    00. Main Menu""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if (Objects.equals(select, "1")){Delivery_reports();}
            if(Objects.equals(select, "2")){Reply();}
            if(Objects.equals(select, "3")){Character_support();}
            if (Objects.equals(select, "4")){Message_settings();}
            if(Objects.equals(select, "00")){Menu();}

        }

    public static void Reply(){
        System.out.print("""
                **************************************
                        Reply via same centre
                ***************************************
                1. Back
                00. Main Menu""");
        System.out.println("\nEnter  menu number: ");
        String select = input.next();
        if (Objects.equals(select, "1")) {
            Common();
        }
        if (Objects.equals(select, "00")) {
            Menu();
        } else {
            Reply();
        }
    }


        public static void Delivery_reports(){
            System.out.print("""
                    ************************************
                            Delivery reports
                    ************************************
                    1. Back
                    00. Common""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if (Objects.equals(select, "1")) {
                Common();
            }
            if (Objects.equals(select, "00")) {
                Menu();
            } else {
                Common();
            }
        }

        public static  void Character_support(){
            System.out.print("""
                    ************************************
                    
                    ************************************
                    1. Back
                   00. Common""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if (Objects.equals(select, "1")) {
                Common();
            }
            if (Objects.equals(select, "00")) {
                Menu();
            } else {
                Character_support();
            }
        }


    public static void  InfoService(){
            System.out.print("""
                    **********************************
                                Info service
                    **********************************
                    1. Back
                    00. Main Menu""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if  (Objects.equals(select, "1")){Message();}
            if (Objects.equals(select,"00")){Menu();}
            else
                InfoService();
        }
        public static void  Voice_Mailbox(){
            System.out.print("""
                    *******************************
                           Voice mailbox number
                    *******************************
                    1. Back
                    00. Main Menu""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if  (Objects.equals(select, "1")){Message();}
            if (Objects.equals(select,"00")){Menu();}
            else
                Voice_Mailbox();
        }

        public static void ServiceCommand(){
            System.out.print("""
                    ***********************************
                            Service command editor
                    ************************************
                    1. Back
                    00. Main Menu""");
            System.out.println("\nEnter  menu number: ");
            String select = input.next();
            if  (Objects.equals(select, "1")){Message();}
            if (Objects.equals(select,"00")){Menu();}
            else
                ServiceCommand();
        }
        public static void Menu(){
            System.out.print("""
                    ===============================================
                                        MENU
                    ===============================================
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10.Reminders
                    11. Clock
                    12. Profiles
                    13. SIM services""");
            while (true) {
                System.out.println("\nEnter for menu number: ");
                String select = input.next();
                if (Objects.equals(select, "1")) {
                    Phone_Book();
                }
                if (Objects.equals(select, "2")) {
                    Message();
                }
            }

        }

    public static  void  main(String [] args) {
        System.out.println("N O K I A");

        while (true) {
            System.out.print("\nEnter 1 main menu: ");
            String menu = input.next();

            if (Objects.equals(menu, "1")) {
                Menu();

            } else {
                System.out.print("wrong entry");

            }
        }



    }


}
