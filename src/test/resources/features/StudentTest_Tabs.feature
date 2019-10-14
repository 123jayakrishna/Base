Feature: Create test in two different tabs of same browser
  Scenario: Teacher and Student are in same browser with different tabs
    Given Teacher is in tab1
    When Teacher click on Proctoring
    And Teacher create a session
    And Teacher click on created session
    And Open student tab
    And Go back to teacher tab
    Then Go back to student again
