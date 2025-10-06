package stepdefinitions.calculator;
import calculator.Calculator;
import io.cucumber.java.en.*;
import org.assertj.core.api.Assertions;
import org.junit.Assert;


public class CalculatorStepDefs {
    Calculator calculator;
    @Given("I have calculator")
    public void i_have_calculator() {
    calculator= new Calculator();
    }

    @When("I add {int} and {int} on my calculator")
    public void i_add_and_on_my_calculator(int num1, int num2) {
    calculator.add(num1,num2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        Assert.assertEquals(expectedResult,calculator.getResult());
    }

    @When("I subtract {int} and {int}")
    public void iSubtractAnd(int num1, int num2) {
        calculator.subtract(num1,num2);

    }

    @When("I multiply {int} and {int}")
    public void iMultiplyAnd(int arg0, int arg1) {
        calculator.multiply(arg0,arg1);
    }

    @When("I divide {int} and {int}")
    public void iDivideAnd(int arg0, int arg1) {
        calculator.divide(arg0,arg1);
    }
}
