package chapter4;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("i love dogs! ");
        }
        for (int i = 0; i <= 15  ; i++){
            System.out.println(i);
        }
        int[] grades = {98, 100, 83, 90, 93};
        for (int i = 0; i < grades.length; i++){
            System.out.println(grades[i]);
        }
    }
}
