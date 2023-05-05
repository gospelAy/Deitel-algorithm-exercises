package chapterTwo;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the firstNumber: ");
        int number1 = input.nextInt();

        System.out.println("Enter the secondNumber: ");
        int number2 = input.nextInt();

        int tripled = number1 * number1 * number1;
        int doubled = number2 * number2;

        if (tripled % doubled == 0) {
            System.out.println("First number tripled is a multiple of the second number doubled");
        } else System.out.println("First number tripled is not a multiple of the second number doubled");
    }
}
