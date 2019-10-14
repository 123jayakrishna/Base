Feature: SetUp a test for a student.
  Scenario: Teacher assign the test and Student should complete.
    Given Proctor setup a test in chrome browser
    When Proctor click on Proctoring
    And   Proctor create a session
    And Proctor click on created session
    And Open student browser
    Then Login into student page
