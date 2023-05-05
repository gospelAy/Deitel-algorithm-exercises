package chapterTwo;


    import java.util.Scanner;

    public class Circle {

        public static void main(String[] args) {

            // Declare constant for PI
            final double PI = 3.141592653;

            Scanner in = new Scanner(System.in);

            /* Input radius of circle from user. */
            System.out.println("Please enter radius of the circle : ");
            int r = in.nextInt();

            /* Calculate diameter, circumference and area. */
            int d = 2 * r;
            double circumference = 2 * PI * r;
            double area = PI * r * r;



            /* Print diameter, circumference and area of circle. */
            System.out.println("Diameter of circle is : " + d);
            System.out.println("Circumference of circle is : " + circumference);
            System.out.println("Area of circle is : " + area);
        }
    }

