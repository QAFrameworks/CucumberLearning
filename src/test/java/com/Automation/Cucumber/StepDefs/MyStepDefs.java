package com.Automation.Cucumber.StepDefs;


import io.cucumber.java.en.*;

public class MyStepDefs extends BaseStepDefs {
    @Given("This is my context")
    public void thisismyContext() {
        System.out.println("check");
    }

    @And("some more context")
    public void someMoreContext() {
        //throw new PendingException();
        //to detail later
    }

    @When("Is an action")
    public void isAnAction() {
    }
}
