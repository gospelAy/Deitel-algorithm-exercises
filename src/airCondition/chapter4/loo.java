package airCondition.chapter4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class loo {
    public static int divideNumber(int number1, int number2){
        return number1 - number2;

    }
    public static int sumOfNumber(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;

    }
    public static int mutiplyNumbers(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divideNumber(50, 20));
        System.out.println(mutiplyNumbers(100, 50));
    }
}
