package chapterThree;
import java.util.Scanner;
public class LargestInteger{
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second integer: ");
        int number2 = input.nextInt();

        System.out.println("Enter the third integer: ");
        int number3 = input.nextInt();

        System.out.println("Enter the 4th integer: ");
        int number4 = input.nextInt();

        System.out.println("Enter the 5th integer: ");
        int number5 = input.nextInt();

        int lag = 0;
        if (number1 > lag)
            lag = number1;

        if (number2 > lag)
            lag = number2;

        if (number3 > lag)
            lag = number3;

                if (number4 > lag)
                    lag = number4;

                if (number5 > lag)
                    lag = number5;
        System.out.println(lag);



            }


        }




