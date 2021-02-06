@scenariooutline @test3 @working
Feature: to explain SO

  Scenario Outline: 1 ignore the GWT here
    When I add <data1> with <data2>
    Then the sum is <result>
    Examples:
      | testdesc    | data1 | data2 | result |
      | 1_test_desc | 4     | 5     | 9      |
      | 2_test_desc | 0     | 5     | 5      |
      | 3_test_desc | -1    | 5     | 4      |
      #intentionally failed
      | 4_test_desc | 4     | 5     | 91      |