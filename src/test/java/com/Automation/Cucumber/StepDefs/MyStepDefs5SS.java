package com.Automation.Cucumber.StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;
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
