package chapterTwo;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle! ");
        int radius = input.nextInt();

        System.out.printf("The circle diameter is %f%nThe circumference of a circle is%f%nThe area of a circle is %f%n", (float)(2 * radius), 2 * Math.PI * radius, Math.PI * radius * radius);


    }
}
