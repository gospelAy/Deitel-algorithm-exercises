package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = input.nextInt();

        System.out.println("Enter the second number");
        int number2 = input.nextInt();

        int tripled = number1 * number1 * number1;
        int doubled = number2 * number2;

        if (tripled % doubled == 0){
            System.out.println("The first number tripled is a multiple of the second number doubled");

        }else System.out.println("The first number tripled is not a multiple of the second number doubled");







    }
}
