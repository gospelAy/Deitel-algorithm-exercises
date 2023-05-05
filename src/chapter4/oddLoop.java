package chapter4;

public class oddLoop {
    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i+=3, i+=2){
//            System.out.printf("This is an odd number");

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}


