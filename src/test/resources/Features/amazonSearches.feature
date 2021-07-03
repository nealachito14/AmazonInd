#Author: nealdeoroing@hotmail.com
#Keywords Summary :
#Feature: amazon Searches

@amazonSearches
Feature: search for the latest motorola cell phone
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @motorola
  Scenario Outline: motorola cell search
    Given the user is on the amazon page
    When the user searches for and a <object>
    And is selected a <brand> in special
    And search the last cellphone in the last and click it
    And add to the cart
    Then the user verifies the last cellphone is in the cart

    Examples: 
      | object          | brand      |
      | "Mobile phones" | "Motorola" |
      
      
