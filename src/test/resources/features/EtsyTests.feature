#Verify that when I click on a submodule then I will be navigated to the corresponding page with the correct title
@etsy
Feature: Etsy Navigation

#  Background:
#    Given I am on the etsy homepage
#
  # @FirstScenario
#  Scenario: Clothing & Shoes Submodule
#    #Given I am on the etsy homepage
#    When I click on 'Clothing & Shoes'
#    Then the site subtitle will be 'Clothing & Shoes'
#
#  @SecondScenario
#  Scenario: Home & Living Submodule
#    #Given I am on the etsy homepage
#    When I click on 'Home & Living'
#    Then the site subtitle will be 'Home & Living'


  Scenario Outline: <subModuleName> Submodules
    Given I am on the etsy homepage
    When I click on '<subModuleName>'
    Then the site subtitle will be '<subModuleName>'




    Examples:
      | subModuleName  |
      | Clothing & Shoes |
      | Home & Living    |





