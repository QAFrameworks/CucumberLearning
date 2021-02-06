package com.Automation.Cucumber.StepDefs;

import io.cucumber.java.en.*;

public class MyStepDefs2 extends BaseStepDefs {

    @Given("This is a background")
    public void thisIsABackground() {
        System.out.println("this is a background");
    }

    @When("another step")
    public void anotherStep() {
        System.out.println("this is another step");
    }
}
