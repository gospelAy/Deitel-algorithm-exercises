package airCondition.chapter4;

import java.util.Scanner;
//
public class fraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double firstNumber = input.nextInt();

        double result = 1;
        double i = 1;
        double total = 0;

        for ( i = 1; i <= firstNumber; i++ ){
            result += firstNumber;
            total += 1 / i;
            System.out.println(1 + "/" + i);
        }
        System.out.println(total);

        }
   }

