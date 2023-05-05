package chapterTwo;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = input.nextInt();

        System.out.println("Enter the 4th number: ");
        int number4 = input.nextInt();

        System.out.println("Enter the 5th number: ");
        int number5 = input.nextInt();

        if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){
            System.out.println(number1 + " is the largest ");
        }
        if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5){
            System.out.println(number2 + " is the largest ");
        }
        if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
            System.out.println(number3 + " is the largest");
        }
        if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5){
            System.out.println(number4 + " is the largest");
        }
        if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4){
            System.out.println(number5+ " is the largest");
        }

        if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){
            System.out.println(number1 + " is the smallest ");
        }
        if(number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5){
            System.out.println(number2 + " is the smallest ");
        }
        if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
            System.out.println(number3 + " is the smallest");
        }
        if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5){
            System.out.println(number4 + " is the smallest");
        }
        if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
            System.out.println(number5 + " is the smallest");
        }
        }
}
