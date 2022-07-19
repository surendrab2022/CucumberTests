Feature: feature to test background in cucumber


  Background: Runthis back ground
    Given I run background
    Then Background is run 

  @sanity
  Scenario: Scenario one of feature one
    Given I want to write a step with precondition
    When I complete action
    And some other action
    Then I validate the outcomes
    And check more outcomes

  @integration
  Scenario: Scenario two of feature one
    Given I want to write a step with precondition
    When I complete action
    And some other action
    Then I validate the outcomes
    And check more outcomes
  