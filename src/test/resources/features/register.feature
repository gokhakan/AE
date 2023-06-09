@regression
Feature: New user registers

  @register
#  Test Case 1: Register User
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
    And user clicks "Delete account"

  @register_with_existing_email
#  Test Case 5:
  Scenario: Register User with existing email
    Given user is on home page
    When user clicks "Signup/Login"
    Then user sees "New User Signup!"
    And  user enters "RegisteredUserName"
    And user enters "RegisteredLoginEmail"
    And user clicks "Signup"
    Then user sees "Email Address already exist!"
