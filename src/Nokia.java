//import java.util.Scanner;
//
//public class Nokia {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.)
//    }
//}

public class Nokia {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int number) {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}