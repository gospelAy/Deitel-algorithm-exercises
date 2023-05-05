package chapterTwo;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        int number3 = input.nextInt();
        System.out.print("Enter the 4th integer: ");
        int number4 = input.nextInt();
        int averageOfNumbers = (number1 + number2 + number3 + number4)/4;

        if(number1 > number2 && number1 > number3 && number1 > number4){
            System.out.println("Number 1 is the maximum number");

        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("Number 2 is the maximum number");

        } if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println("Number 3 is the maximum number");
        } else if (number4 > number1 && number4 > number2 && number4 > number3 ) {
            System.out.println("Number 4 is the maximum number");
        }
        if (number1 < number2 && number1 < number3 && number1 < number4){
            System.out.println("Number 1 is the minimum number  ");
        } else if (number2 < number1 && number2 < number3 && number2 < number4) {
            System.out.println("number 2 is the minimum number ");
        } if (number3 < number1 && number3 < number2 && number3 < number4) {
            System.out.println("number 3 is the minimum number ");

        }else if (number4 < number1 && number4 < number2 && number4 < number3 ) {
            System.out.println("number 4 is the minimum number ");
        }
        System.out.printf("The average of the number is %d%n", averageOfNumbers);

        }

    }




