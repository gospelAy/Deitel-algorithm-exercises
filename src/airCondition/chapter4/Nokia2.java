package airCondition.chapter4;
import java.util.Scanner;

public class Nokia2 {
    public static void listOfMenuFunction(){
        System.out.println("""
                list of menu functions
                
                1. phone book
                2. Messages
                3. Chat 
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Game 
                9. Calculator
                10. Reminders
                11. Clock
                12. profiles
                13. SIM service
                
                0. Exit
                """);
        }
        public static void phoneBookMenu(){
            System.out.println("""
                    Phone Book Enter any option to continue
                    
                    1. Search
                    2. Service Nos.
                    3. Add name 
                    4. Erase
                    5. Edit
                    6. Assign tone 
                    7. Send b' card
                    8. Options
                    9. Speed dials
                    10. Voice tags
                    """);
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();

            switch (userInput){
                case 1:
                    System.out.println("""
                            1. Search 
                                
                            0. Exit""");

            }

      }
}



