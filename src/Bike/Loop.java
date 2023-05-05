package Bike;

public class Loop {
    public static void main(String[] args){
        pattern(10);
        pattern2(10);
        pattern3(10);
    }
    public static void pattern(int number){
        for (int i = 1; i <= number ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void pattern3(int number){
        for (int i = number; i >= 0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int number){

    }
}
