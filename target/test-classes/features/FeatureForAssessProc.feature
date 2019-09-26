Feature: Check functionality od Data Manager
  Scenario: Navigate to Assessment Page followed by Protor Page
    Given Open Chrome browser and navigate to DM
    When User Enter user name
    And User enter password
    And User click on SignIn
    When User navigate to Assessment page
    And user navigate back to home page
    And User navigate to Proctor page
    Then Browser should be closed