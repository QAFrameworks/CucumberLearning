package com.Automation.Cucumber.StepDefs;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class MyStepDefs3SO extends BaseStepDefs {
int calculationResult;

    @When("I add {int} with {int}")
    //Cucumber Expression
    public void iAddDataWithData(int operand1, int operand2) {
        calculationResult=operand1+operand2;
    }

    @Then("the sum is {int}")
    //Regular Expression
    public void theSumIsResult(int x) {
        Assert.assertEquals(x,calculationResult);
    }
}
