package chapterTwo;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in pound");
        double weightInPounds = input.nextDouble();

        System.out.println("Enter the height in inches");
        double heightInInches = input.nextDouble();

        double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);

        System.out.println("The BMI is " + bmi);





    }
}
