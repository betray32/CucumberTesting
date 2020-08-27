Feature: Belly

  Scenario: a few cukes
    Given I have 10 cukes in my belly
    When I wait 2 hour
    Then my belly should growl
