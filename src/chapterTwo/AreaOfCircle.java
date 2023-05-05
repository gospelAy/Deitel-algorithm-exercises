package chapterTwo;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        int radius = scanner.nextInt();

        final float PI = (float) Math.PI;

        System.out.printf("The circle diameter is %f%nThe circumference of a circle is%f%nThe area of a circle is %f%n", (float)(2 * radius), 2 * PI * radius, PI * radius * radius);

    }
}
//    he circle diameter is 8.000000
//        The circumference of a circle is25.132741
//        The area of a circle is 50.265482
