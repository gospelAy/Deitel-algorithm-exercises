package chapter5;

public class Diamond {
    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        Diamond.upperPart();
        Diamond.lowerPart();


    }

    private static void upperPart() {
        for (int i = 0; i < 5; i++) {
            for (int diamond =i; diamond< 5; diamond++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void lowerPart(){
        for (int i = 1; i < 5; i++) {
            for (int diamond= i + 1; diamond >= 1 ; diamond--) {
                System.out.print(" ");
            }
            for (int j = 7; j > i ; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
