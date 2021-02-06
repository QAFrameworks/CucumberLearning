package com.Automation.Cucumber.StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

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
