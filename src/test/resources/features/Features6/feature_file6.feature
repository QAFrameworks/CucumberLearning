@cucumberexpression @test6 @working
  Feature: to explain sharing of state between steps  - Expressions
    Scenario: 1 ignore the GWT here example of DataSharing between State- Expression
      Given User add 4 & 5
      Then the result "is" 9

    Scenario: 2 ignore the GWT here example of DataSharing between State- Expression
      Given User add 5 & 6
      Then the result "is" 11

    Scenario: 3 ignore the GWT here example of DataSharing between State- Expression
      Given User add 5 & 6
      Then the result "is not" 13
      #try with regular expression

  # mention double and float usage  - int
