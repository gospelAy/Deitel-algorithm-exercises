package Calculator;

public class Calculator {
    // add, subtract, multiply, divide.
    public static int addNumber(int number1, int number2){
        int resultOfAddition = number1 + number2;

        return resultOfAddition;
    }

    public static int SubNumber(int firstNumber, int secondNumber){
        int resultOfNumber = firstNumber - secondNumber;

        return resultOfNumber;
    }

    public static int multiplyNumber(int number1, int number2){
        int resultOfNumber = number1 * number2;

        return resultOfNumber;
    }

    public static String divideNumber(int firstDigit, int secondDigit){
        int resultOfDigit = firstDigit / secondDigit;
        int remainderOfTheDivision = firstDigit % secondDigit;
        return resultOfDigit + " remainder " + remainderOfTheDivision;
    }
    public double calculate(int number){
        double answer =(double)(number / 2) + 5;
        return answer;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(23));
        addNumber(10, + 20);
    }

//    public static void main(String[] args) {
//        System.out.println(divideNumber(20, 3));
//
//        System.out.println(addNumber(3, 4));
//
//    }


}
