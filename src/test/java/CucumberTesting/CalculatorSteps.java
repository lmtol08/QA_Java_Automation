package CucumberTesting;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

/*
Feature: Calculator
  As a user
  I want to perform basic arithmetic operations
  So that I can calculate mathematical expressions

  Scenario: Add two numbers
    Given I have entered 6 into the calculator
    And I have entered 7 into the calculator
    When I Press add
    Then the result should be 13 on the screen.

  Scenario: Subtract two numbers
    Given I have entered 10 into the calculator
    And I have entered 5 into the calculator
    When I Press subtract
    Then the result should be 5 on the screen
 */
public class CalculatorSteps {
    private int num1;
    private int num2;
    private int result;

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int number) {
        if (num1 == 0) {
            num1 = number;
        } else {
            num2 = number;
        }
    }

    @When("I Press add")
    public void i_press_add() {
        result = num1 + num2;
    }

    @When("I Press subtract")
    public void i_press_subtract() {
        result = num1 - num2;
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int expected) {
        Assert.assertEquals(expected, result);
    }

    @Then("the result should be {int} on the screen.")
    public void theResultShouldBeOnTheScreen(int expected) {
        Assert.assertEquals(expected, result);
    }
}