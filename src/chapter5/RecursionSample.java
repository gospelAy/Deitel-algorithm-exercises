package chapter5;

public class RecursionSample {
    public static void main(String[] args) {
        printRightFacingRightAngledTriangle(5);
        printLeftFacingRightAngeled(7);
    }
    private static void printRightFacingRightAngledTriangle(int number){
        if (number<1){
            return;
        }
        number-=1;
        printRightFacingRightAngledTriangle(number);
        for (int index = 0; index < number; index++){
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printLeftFacingRightAngeled(int number){
        int spacing = number;
        if (number<1){
            return;
        }
        number-=1;
        printLeftFacingRightAngeled(number);
        for (int index = number; index>7; index++){
            System.out.print(" ");
        }
        System.out.println();
    }
}
