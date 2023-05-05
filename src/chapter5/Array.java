package chapter5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 34;
        numbers[1] = 7;
        numbers[2] = 3;
        numbers[3] = 78;
        numbers[4] = 67;
        int num = numbers[3];
        System.out.println(num);
        System.out.println(Arrays.toString(numbers));


        int [] five = {23, 34, 23, 23, 23};
        int m = five[1];
        System.out.println(m);
        System.out.println(Arrays.toString(five));
        }

    }

