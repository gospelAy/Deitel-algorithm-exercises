package selfAssessment;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        int [] [] [] numbers2 = new int[5][3][60];

//        int[][][] numbers3 = new int[5][3][2];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers2));
        System.out.println(Arrays.toString(numbers2[0]));
        System.out.println(numbers2[1][2]);
//        System.out.println(Arrays.deepToString(numbers3));
    }
}
