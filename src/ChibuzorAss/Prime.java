package ChibuzorAss;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
            if(number % 2 ==0 ){
                System.out.println(number +"is a prime number");
            }
            else {
                System.out.println(number+"is not a prime number");
            }
        }
    }

