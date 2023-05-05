package chapterTwo;

import java.util.Scanner;

public class ReadIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNumberTripled  = input.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumberDouble = input.nextInt();

        if( firstNumberTripled % secondNumberDouble == 0){
            System.out.println(firstNumberTripled+" is a multiple of the second number doubled");

        }else
            System.out.println(secondNumberDouble+ " It is not a multiple of first number tripled");


    }
}
