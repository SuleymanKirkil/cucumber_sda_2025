package calculatorjunittest;

import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    Calculator calculator;
    @Test
    public void additionTest() {
        calculator= new Calculator();
        calculator.add(20,5);
        int expectedResult = 25;
        Assert.assertEquals(expectedResult,calculator.getResult());
    }

    @Test
    public void subtrctionTest() {
        calculator= new Calculator();
        calculator.subtract(20,5);
        int expectedResult = 15;
        Assert.assertEquals(expectedResult,calculator.getResult());
    }

    @Test
    public void multiplicationTest() {
        calculator= new Calculator();
        calculator.multiply(20,5);
        int expectedResult = 100;
        Assert.assertEquals(expectedResult,calculator.getResult());
    }

    @Test
    public void divisionTest() {
        calculator= new Calculator();
        calculator.divide(20,5);
        int expectedResult = 4;
        Assert.assertEquals(expectedResult,calculator.getResult());
    }
}
