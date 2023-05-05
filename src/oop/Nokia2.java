package oop;

import javax.xml.transform.Templates;
import java.util.Scanner;

public class Nokia2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to Nokia !!!
                Select an Option to continue
                              
                1.  PhoneBook
                2.  Messages
                3.  Chat
                4.  Call Register
                5.  Tonnes
                6.  Settings
                7.  Call Divert
                8.  Games
                9.  Calculator
                10. Reminder
                11. Clock
                12. Profiles
                13. SIM Services
                """);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("""
                        Select an Option to continue
                                                
                        1.  Search
                        2.  Service Nos.
                        3.  Add name
                        4.  Erase
                        5.  Edit
                        6.  Assign tone
                        7.  Send b'card
                        8.  Options
                        9.  Speed Dials
                        10. Voice tags 
                        """);

                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 8:
                        System.out.println("""
                                 Select an Option to continue
                                 
                                1.  Type of View
                                2.  Memory Status
                                """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("Type of View");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }
                    case 9:
                        System.out.println("Speed Dials");
                        break;
                    case 10:
                        System.out.println("Voice Tag");
                        break;
                }
            case 2:
                System.out.println("""
                        select an option to continue
                        1. write messages
                        2. inbox
                        3. outbox
                        4. picture messages
                        5. Templates
                        6. Smileys
                        7. Messages settings
                        8. info service
                        9. voice mailbox
                        10. Service command editor
                                        """);
                input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("inbox");
                        break;
                    case 3:
                        System.out.println("outbox");
                        break;
                    case 4:
                        System.out.println("picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("""
                                select an option to continue
                                   1. Set 1
                                   2. Common
                                  """);
                        input = scanner.nextInt();
                        switch (input) {
                            case 1:
                                System.out.println("""
                                        select an option to continue
                                        1. Messages centre number
                                        2. Messages sent as
                                        3. Message validity
                                        """);

                                input = scanner.nextInt();
                                switch (input) {
                                    case 1:
                                        System.out.println("Messages centre number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                }
                                input = scanner.nextInt();
                                switch (input) {
                                    case 2:
                                        System.out.println("""
                                                select an option to continue
                                                 1. Delivery reports
                                                 2. Reply via same centre
                                                 3. Character support
                                                 """);
                                        input = scanner.nextInt();
                                        switch (input) {
                                            case 1:
                                                System.out.println("Delivery reports");
                                                break;
                                            case 2:
                                                System.out.println("Reply via same centre");
                                                break;
                                            case 3:
                                                System.out.println("Character support");
                                                break;
                                        }
                                }
                        }
                }
                            case 3:
                                System.out.println("chat");
                                break;

                            case 4:
                                System.out.println("""
                                        select an option to continue
                                       
                                        1. Missed calls
                                        2. Received calls
                                        3. Dialled number
                                        4. Erase recent call lists
                                        5: Show call duration
                                        6: Show call costs 
                                        7: Call cost settings
                                        8: prepaid
                                        """);

                                input = scanner.nextInt();
                                switch (input) {
                                    case 1:
                                        System.out.println("Missed calls");
                                        break;
                                    case 2:
                                        System.out.println("Received calls");
                                        break;
                                    case 3:
                                        System.out.println("Dialled number");
                                        break;
                                    case 4:
                                        System.out.println("Erase recent call lists");
                                        break;
                                    case 5:
                                        System.out.println("""
                                                Choose an option to continue
                                                
                                                1. Last call duration
                                                2. All Call's duration
                                                3. Received call's duration
                                                4. Dialled calls' duration
                                                5. clear timers
                                                """);
                                        input = scanner.nextInt();
                                        switch (input){
                                            case 1:
                                                System.out.println("Last call duration");
                                                break;
                                            case 2:
                                                System.out.println("All Call duration");
                                                break;
                                            case 3:
                                                System.out.println("Received call's duration");
                                                break;
                                            case 4:
                                                System.out.println("Dialled calls' duration");
                                                break;
                                            case 5:
                                                System.out.println("clear timers");
                                                break;
                                        }
                                    case 6:
                                        System.out.println("""
                                                select an option to continue
                                                
                                                1. Last Call cost
                                                2. All call's cost
                                                3. Clear counters
                                                """);
                                        input = scanner.nextInt();
                                        switch (input){
                                            case 1:
                                                System.out.println("Last Call cost");
                                                break;
                                            case 2:
                                                System.out.println("All calls cost");
                                                break;
                                            case 3:
                                                System.out.println("Clear counters");
                                                break;
                                        }
                                    case 7:
                                        System.out.println("""
                                                select an option to continue
                                                
                                                1. Call cost limit
                                                2. Show costs in
                                                """);
                                        input = scanner.nextInt();
                                        switch (input) {
                                            case 1:
                                                System.out.println("Call cost limit");
                                                break;
                                            case 2:
                                                System.out.println("Show cost in");
                                                break;
                                        }


                                }

                        }


                }

}






