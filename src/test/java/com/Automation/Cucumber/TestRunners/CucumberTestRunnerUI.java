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
        tags = "@working", //not
        plugin = {"pretty", "html:target/cucumber-original/cucumber.html",
                "json:target/cucumber-report.json",
                "rerun:target/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"


        },
        publish = true  //3 other ways. cucumber.properties easy one
)
public class CucumberTestRunnerUI {
}


//mvn clean test -Dtest=CucumberTestRunnerUI, run the specified Test runner
//mvn clean install -Dtest=CucumberTestRunnerUI   , look for jar creation
//mvn clean test , if runner class is prefixed or suffixed with test

        //mvn clean test -Dtest=CucumberTestRunnerUI -Dcucumber.options="--tags '@test6'"   - old way

        //mvn clean test -Dtest=CucumberTestRunnerUI -Dcucumber.filter.tags="@test6"   --New way