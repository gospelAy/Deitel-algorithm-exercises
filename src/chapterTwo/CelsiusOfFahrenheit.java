package chapterTwo;

import java.util.Scanner;

public class CelsiusOfFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in celsius: ");
        double celsius = input.nextDouble();

        double degreeInFahrenheit = (double)(9)/ 5 * celsius + 32;
        System.out.println("celsius is "+degreeInFahrenheit+ " Fahrenheit");
    }
}
