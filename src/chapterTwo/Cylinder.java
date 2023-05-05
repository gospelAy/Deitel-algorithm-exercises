package chapterTwo;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of a cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter the length of cylinder: ");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %.4f%n The volume is %.1f%n", area, volume);
    }
}
