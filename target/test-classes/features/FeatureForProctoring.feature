Feature: AssessmentProtcor
  Scenario: Naviagte from Home to Assement to Proctor
    Given open chrome browser
    When Login into Data Manager site
    And Enter username
    And enter password
    And Click on signIn
    And Goto proctor page
    Then Create a Test Session