package ChibuzorAss;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for (int i = 1; i <13 ; i++) {
            System.out.println(number+ " times " +i+" is "+number * i );

        }
    }
}
