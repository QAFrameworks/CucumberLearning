package com.Automation.Cucumber.TestRunners;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/rerun.txt",
        glue = {
                "com.Automation.Cucumber.StepDefs", "com.Automation.Cucumber.Hooks"
        },
        plugin = {"pretty", "html:target/cucumber-original-rerun/cucumber.html",
                "json:target/cucumber-report-rerun.json"

        },
        publish = true // try other ways //some changes
)
public class CucumberTestReRunnerUI {
}



