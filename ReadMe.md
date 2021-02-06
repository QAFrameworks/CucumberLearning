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
* usig maven at CLI

mvn clean test -Dcucumber.options="--tags '@test6'"
mvn clean test -Dcucumber.options="--tags '@test6 or @test5'"
mvn clean test -Dcucumber.options="--tags '@test3 and @working'"
mvn clean test -Dcucumber.options="--tags '~@test1'"