package com.Automation.Cucumber.StepDefs;

import com.Automation.Cucumber.Context.TestContext;

import static com.Automation.Cucumber.Context.TestContext.CONTEXT;


public class BaseStepDefs {
    protected TestContext testContext() {
        return CONTEXT;
    }
}

