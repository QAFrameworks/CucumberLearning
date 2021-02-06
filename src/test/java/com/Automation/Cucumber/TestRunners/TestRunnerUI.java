package com.Automation.Cucumber.TestRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/",
        strict = true,
        glue = {
                "com.Automation.Cucumber.StepDefs", "com.Automation.Cucumber.Hooks"
        },
        tags = {"@working"},
        plugin = {
                "json:target/cucumber-report.json"
        }
)
public class TestRunnerUI {
}
