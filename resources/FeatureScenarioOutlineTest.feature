Feature: Feature to test scenario outline

 @outline
  Scenario Outline: Scenario Outline tests
    Given my name is "<name>"
    When my rollnumber are "<roll>"
    Then I verify my enrollment as "<status>"

    Examples: 
      | name  | roll | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
