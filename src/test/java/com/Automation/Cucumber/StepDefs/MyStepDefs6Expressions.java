package com.Automation.Cucumber.StepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;
import java.util.Random;

public class MyStepDefs6Expressions extends BaseStepDefs {
int calculationResult;


    @Given("User {word} {int} & {int}")
    public void userAdd(String operator,int operand1, int operand2) {
        int result = doCalculation(operator,operand1,operand2);
        testContext().set("Result",result);
    }

    @Then("the result {string} {int}")
    public void theResult(String check, int expected) {
        performCheck(check,expected,testContext().get("Result"));


    }

    private void performCheck(String condition, int expected, Object result) {
        switch (condition) {
            case "is" :
                Assert.assertEquals(expected,result);
                break;
            case "is not" :
                Assert.assertNotEquals(expected,result);
                break;
        }
    }

    private int doCalculation(String operator, int operand1, int operand2) {
        switch(operator) {
            case "add" :
                calculationResult = operand1+operand2;
                break;
            case "subtract" :
                calculationResult = operand1-operand2;
                break;
            case "multiple" :
                calculationResult = operand1*operand2;
                break;
        }
        return calculationResult;
    }
}
