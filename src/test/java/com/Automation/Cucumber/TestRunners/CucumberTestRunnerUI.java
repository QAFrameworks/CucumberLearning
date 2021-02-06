package com.Automation.Cucumber.TestRunners;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/",
        strict = true,
        glue = {
                "com.Automation.Cucumber.StepDefs", "com.Automation.Cucumber.Hooks"
        },
        tags = "@working",
        plugin = {"pretty", "html:target/cucumber-original/cucumber.html",
                "json:target/cucumber-report.json",
                "rerun:target/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"


        },
        publish = true  //3 other ways. cucumber.properties easy one
)
public class CucumberTestRunnerUI {
}


//mvn clean test -Dtest=CucumberTestRunnerUI
//mvn clean test -Dcucumber.options="--tags '@test6'"