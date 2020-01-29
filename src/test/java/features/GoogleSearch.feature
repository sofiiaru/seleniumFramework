@google
Feature: Google search feature

  Scenario: Making sure google search is working as expected

    Given User is on the homepage
    And User enters flowers
    And user clicks search button
    Then user should see results related to flowers