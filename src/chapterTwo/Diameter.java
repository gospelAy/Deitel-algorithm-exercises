package chapterTwo;

import java.sql.SQLOutput;
import java.util.Scanner;
 public class Diameter {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your age: ");
         int age = input.nextInt();

         int sumOfAge = age * 3;

         System.out.println("calculate the age three time " + sumOfAge);
     }
}




