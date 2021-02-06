10 min theory BDD Theory

BDD TDD
Data is the key INput/Output/Intermediary
Config Data- Environment, Test Data Changes, Parallel, Sequence, Local, Grid, Screnshot
QA COllaboration required to interpret business requirement into executable specifications.

Living Documentation
3 AMigos Purpose - No AMbiguity. info c3. preventing FAD, suggestions.
3c style con, communi and collaboration

US+AC versus Traditional Docs
Screnario creation Review

5 mins tool
JDK
MAVEN
IntelliJ plugin importance
Settings
POM.xml
Cucumber JVM Library

45 mins
Feature\Scenario\Steps\Scenario Outline\Hooks\Background

3 ways of execution
* using the plugin
* using Intellij SHortCut
* using maven at CLI

mvn clean test -Dcucumber.options="--tags '@test6'"
mvn clean test -Dcucumber.options="--tags '@test6 or @test5'"
mvn clean test -Dcucumber.options="--tags '@test3 and @working'"
mvn clean test -Dcucumber.options="--tags '~@test1'"


5 Questions
1.Given below cuboid Dimensions, verify the volume is correct or not
L=3, B=4, H=5 Volume = 60
L=3, B=4, H=6 Volume = 60

Use scenario outline here

The expectation is to print true or False, based on calculation
Volume = L* B * H

2.Devise a Random Integer Number in Cucumber Background Step

Write 2 scenario
a. to identify if the randomly generated number is prime
b. to identify if the randomly generated number is Odd or Even


3. Implement below scenario return sout based on calculation results

Scenario: Training_DataTable
Given Check below calculation
|add,4,5|9|
|subtract,6,3|3|
|multiply,2,5|3|


4. Read about Imperative and Declarative scenarios

5.Practice Cucumber Expression from 
https://cucumber.io/docs/cucumber/cucumber-expressions/