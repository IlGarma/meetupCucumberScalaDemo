
Feature: Gherkin
  In order to write the right software
  As a team member
  I want to use Cucumber

  Scenario: Summation of 5 and 3
    Given I have 5 as first number
      And I have 3 as second number
    When I sum these number
    Then The result should be 8

#
#  Scenario: Use Cucumber to verify the acceptance criteria
#    Given I attended the Cucumber meetup
#    When I test the business story
#    Then I should use Cucumber to verify the acceptance criteria

#
#  Scenario: Summation of 10 and 12
#    Given I have 10 as first number
#    And I have 12 as second number
#    When I sum these number
#    Then The result should be 22
#
#  Scenario: Summation of 0 and 2
#    Given I have 0 as first number
#    And I have 2 as second number
#    When I sum these number
#    Then The result should be 2
#
#  Scenario Outline: Summation of two numbers
#    Given I have <firstNumber> as first number
#    And I have <secondNumber> as second number
#    When I sum these number
#    Then The result should be <expectedResult>
#
#    Examples:
#      |firstNumber|secondNumber|expectedResult|
#      |5          |3           |8             |
#      |10         |12          |22            |
#      |0          |2           |2             |
