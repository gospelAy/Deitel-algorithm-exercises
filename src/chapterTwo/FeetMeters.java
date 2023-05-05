package chapterTwo;

import java.util.Scanner;

public class FeetMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            final double meterForFoot = 0.305;
        System.out.println("Enter a value for feet:");
        double feet = input.nextDouble();

        double meters = meterForFoot * feet;

        System.out.print(feet + " feet is "+ meters+ " meters");




    }
}
