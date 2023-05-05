package chapterThree;

import java.util.Scanner;
public class Smallest4{
    public static void main(String... args){
        Scanner input = new Scanner (System.in);
        int largest = 0;
        int smallest = 0;

        System.out.println("Enter the first integer");
        int number1 = input.nextInt();

        System.out.println("Enter the second integer");
        int number2 = input.nextInt();

        System.out.println("Enter the third integer");
        int number3 = input.nextInt();

        int sumOfNumber = number1 + number2 + number3;

        int averageOfNumbers = number1 + number2 + number3/3;

        int productOfNumbers = number1 * number2 * number3;

        largest = number1;
        smallest = number1;

        if(number2 > largest){
            largest = number2;
        }

        if(number3 > largest){
            largest = number3;
        }

        if(number2 < smallest){
            smallest = number2;
        }

        if(number3 < smallest){
            smallest = number3;
        }

        System.out.printf("The largest number is: %d%n The smallest number is: %d%n The sum of numbers is: %d%n The average of numbers is: %d%n The product of number is: %d%n", largest, smallest, sumOfNumber, averageOfNumbers, productOfNumbers);





    }

}
