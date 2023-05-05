package chapterTwo;

import java.sql.SQLOutput;

//public class Welcome1 {
//    public static void main(String[] args){
//        System.out.print("Welcome to ");
//        System.out.println("java Programming!");
//    }
//}
/*public class Welcome1{
    public static void main(String[] args){
        int dateOfBirth = 2022;
        String name = "IK";
        boolean married = true;
        double temp = 45.8567;

        System.out.println("\nWelcome to java, i am " + name + ",\n i was born in " + dateOfBirth + " and i know you might wanna" +
                " know if i am married and that is " + married);

        System.out.println("");

        System.out.printf("%s%s%s%d%s%s%b%s%.2f", "Welcome to java, i am ", name, ", i was born in ", dateOfBirth, " and i know you might wanna",
                " know if i am married and that is ", married, " and my temperature is ", temp);

    }
/*}
 */
//
/*public class Welcome1{
    public static void main(String[] args){
        System.out.printf("%s%n%s%n", "Welcome to", "java programming!");
    }

}*/
/*import java.util.Scanner;
public class Welcome1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        System.out.printf("The sum of the numbers is %d%n The product of the numbers is %d%n", sum, product);

    }
}*/
/*public class Welcome1{
    public static void main(String[] args) {
        int digit = 15;
        String name = "bola";
        double decimalNumber = 34.978;

        System.out.println("\nThe digit of the number is: " + digit + "\nThe name of the number is: " + name +"\nThe decimal number is: " + decimalNumber );
    }
}*/
/*import java.util.Scanner;
public class Welcome1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int number1 = input.nextInt();
        System.out.println("Enter the second integer:");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.printf("The sum of the number is %d%n", (number1 + number2));

    }
}*/

/*import java.util.Scanner;
public class Welcome1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if (number1 == number2){
            System.out.printf("");
        }
    }
}
 */
/*import java.util.Scanner;
public class Welcome1 {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the first integer:");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer:");
        int number2 = input.nextInt();

        int squareOfNumber1 = number1 * number1;

        int squareOfNumber2 = number2 * number2;

        int sumOfNumbers = squareOfNumber1 + squareOfNumber2;

        int differenceOfNumbers = squareOfNumber1 - squareOfNumber2;
        System.out.printf("The square of  number 1 is %d%n The square of number 2 is: %d%n The sum of the numbers is %d%n The difference of the numbers is %d%n", squareOfNumber1, squareOfNumber2, sumOfNumbers, differenceOfNumbers);

    }
}*/

/*import java.util.Scanner;
public class Welcome1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer:");
        int number1 = input.nextInt();

        int squareOfNumber = number1 * number1;

        if(number1 > 100){
            System.out.println("number is greater than 100 ");
        } else if (number1 == 100) {
            System.out.println("number is equal to 100 ");
        } else {
            System.out.println("number is not equal to 100 ");
        }

        if(squareOfNumber > 100){
            System.out.println("squareOfNumber is greater than 100 ");
        } else if (squareOfNumber == 100) {
            System.out.println("squareOfNumber is equal to 100 ");
        } else if (squareOfNumber != 100) {
            System.out.println("squareOfNumber is not equal to 100 ");
        }
    }
}*/
import java.util.Scanner;
public class Welcome1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number :");

        int number1 = input.nextInt();

        System.out.println("Enter the second number :");

        int number2 = input.nextInt();

        System.out.println("Enter the third number :");

        int number3 = input.nextInt();

        int sumOfNumbers = number1 + number2 + number3;

        int averageOfNumber = (number1 + number2 + number3)/3;

        int productOfNumbers = number1 * number2 * number3;

         if(number1 > number2 && number1 > number3){
             System.out.println(number1 + " is the largest number");
         }
         if(number2 > number1 && number2 > number3){
             System.out.println(number2 + " is the largest number");

         }
         if(number3 > number1 && number3 > number2){
             System.out.println(number3 + " is the largest number");
         }
         if(number1 < number2 && number1 < number3){
             System.out.println(number1 + " is the smallest number");
         }
         if(number2 < number1 && number2 < number3){
             System.out.println(number2 + " is the smallest number");

         }
          if(number3 < number1 && number3 < number2){
              System.out.println(number3 + " is the smallest number");
          }
        System.out.println("\nThe sum of the numbers is " + sumOfNumbers + "\nThe average of numbers is " + averageOfNumber + "\nThe product of numbers is " + productOfNumbers);
        }

    }


