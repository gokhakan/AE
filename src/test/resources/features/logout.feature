Feature: Logout tests

  @logout
#  Test Case 4:
  Scenario: Logout User
    Given user is on home page
    When user clicks "Signup/Login"
    And user enters "CorrectLoginEmail"
    And user enters "CorrectLoginPassword"
    And user clicks "Login"
    Then user sees "Logged in as correct name"
    When user clicks Logout after successful login
    Then user is on login page