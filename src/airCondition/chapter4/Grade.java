package airCondition.chapter4;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.println("Enter grade");
            int grade = input.nextInt();

            total = total + grade;

            gradeCounter = gradeCounter + 1;
            if (gradeCounter != 11)
                continue;

            int average = total / 10;

            System.out.println(" Total of all 10 grades is " + total + " Class average is " + average);
        }
    }
}
