package chapterThree;

import chapterTwo.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(34,45);
        System.out.println(add);

        int sub = calculator.sub(20,34);
        System.out.println(sub);
    }
}
