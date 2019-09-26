Feature: Check the functionality of Data Manager


  @AssessProc
  Scenario: Navigate to Assessment Page followed by Protor Page
    Given Open Chrome browser and navigate to DM
    When User Enter user name
    And User enter password
    And User click on SignIn
    When User navigate to Assessment page
    And user navigate back to home page
    And User navigate to Proctor page
    Then Browser should be closed


    @Proctor
    Scenario: Naviagte from Home to Assement to Proctor
      Given open chrome browser
      When Login into Data Manager site
      And Enter username
      And enter password
      And Click on signIn
      And Goto proctor page
      Then Create a Test Session
