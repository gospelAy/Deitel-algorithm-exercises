package chapterTwo;

import java.util.Scanner;

public class Divided {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number % 3 == 0){
            System.out.println("number is divisible by 3 ");

        }else System.out.println("number is not divisible by 3 ");
    }
}
