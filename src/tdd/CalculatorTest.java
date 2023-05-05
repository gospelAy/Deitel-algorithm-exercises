package tdd;

import chapterTwo.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class CalculatorTest {

    @Test
    public void testThatCalculatorExists(){
        //  Given that we create a calculator
        Calculator calculator = new Calculator();
        //  When we check the calculator object
        //  Assert That the calculator object is not null
        assertNotNull(calculator);
    }

    @Test
    public void testAdd(){
       // Given
        //a. that we have a calculator
        Calculator calculator = new Calculator();
        //b. that we want to add two numbers together
        int firstNumber = 100;
        int secondNumber = 200;
        //2. When we add the numbers
        int sum = calculator.add(firstNumber, secondNumber);
        System.out.println(sum);
        // 3. check that the result of adding is equal to the
        // sum of both numbers
        assertEquals(300, sum);
    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int firstNumber = 20;
        int secondNumber = 10;
        int sub = calculator.sub(firstNumber, secondNumber);
        System.out.println(sub);
        assertEquals(10, sub);
    }
    @Test
    public void testMulti(){
       Calculator calculator = new Calculator();
       int firstNumber = 50;
       int secondNumber = 7;
       int multi = calculator.Multi(firstNumber,secondNumber);
        System.out.println(multi);
        assertEquals(350, multi);

    }
}
