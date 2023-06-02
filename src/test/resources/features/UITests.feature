@regression
Feature: AE UI tests

  @wip
  Scenario: Register User
    Given user is on home page
    When user clicks "Signup/Login"
    Then user sees "New User Signup!"
    And  user enters "Name"
    And user enters "Email"
    And user clicks "Signup"
    Then  user sees "ENTER ACCOUNT INFORMATION"
    And user enters "Title"
    And user enters "Password"
    And user enters "Birth day"
    And user enters "Birth month"
    And user enters "Birth year"
    And user clicks "Sign up for our newsletter"
    And user clicks "Receive special offers from our partners"
    And user enters "First name"
    And user enters "Last name"
    And user enters "Company"
    And user enters "Address"
    And user enters "Address2"
    And user enters "Country"
    And user enters "State"
    And user enters "City"
    And user enters "Zipcode"
    And user enters "Mobile number"
    And user clicks "Create Account"
    Then user sees "ACCOUNT CREATED"
    And user clicks "Continue"
    Then user sees "userName"
