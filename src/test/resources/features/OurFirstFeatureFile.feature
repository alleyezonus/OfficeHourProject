Feature:  '@Optional' Testing Cucumber Approach (Maybe write the user story)

  #Background runs before every scenario
  Background:
    * Precondition One
   # Precondition one will RUN before Scenario One and Second Scenario
  Scenario: '@Optional' Scenario One
    # Precondition two and three will run ONLY for Scenario ONE
    Given Precondition Two
    * Precondition Three
    When Action one
    And Action two
    Then Outcome one
    And Outcome two

  Scenario: Second Scenario
    When Action
    Then Outcome
