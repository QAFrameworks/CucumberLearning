package com.Automation.Cucumber.StepDefs;

import io.cucumber.java.en.*;
import java.util.Random;

public class MyStepDefs5SS extends BaseStepDefs {
int calculationResult;



    @Given("the data is created here")
    public void theDataIsCreatedHere() {
        int randomNumber = new Random().nextInt(Integer.MAX_VALUE);
        testContext().set("ApprovalID",randomNumber);
    }

    @When("the data is retrieved here")
    public void theDataIsRetrievedHere() {
        System.out.println("the approval is randomly generated is"+testContext().get("ApprovalID").toString());
    }
}
