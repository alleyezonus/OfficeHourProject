@parameters
Feature: Parameters at work

  Scenario: String Parameters & Number Parameters
    Given I am on the 'login' page
    When I enter username "admin" and password 'admin'
#    When I enter username "" and password ""
    And I call row 4 and column 3.0 data
    And I click login
    Then I should be navigated to homepage

  Scenario: Data Parameter
    Given I am on the 'apply' page
    When I enter the following data
      | Info1 | Info2 | Info3   |
      | name  | DOB   | address |

