@test1
  Feature: some feature name to demonstrate state exchange between steps
    @sc1
    Scenario: 1 GWT
      Given This is my context
      When Is an action
      Then is an experiment which can be asserted upon
      #Explain tags level here

    @sc2
    Scenario: desc 2 goes here to Explain And
      Given This is my context
      When Is an action
      And an additional action follows
      Then is an experiment which can be asserted upon
      #Explain tags level here

    Scenario: desc 3 goes here to Explain And can fit at all level
      Given This is my context
      And some more context
      When Is an action
      Then is an experiment which can be asserted upon
      And an additional assertion

    Scenario: desc 4 goes here to Explain Max steps and smart writing
      Given This is my context
      And some more context
      When Is an action
      Then is an experiment which can be asserted upon
      And an additional assertion

    Scenario: desc 5 goes here to Explain But level avoid
      Given This is my context
      And some more context
      When Is an action
      But usually avoided