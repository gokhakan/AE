Feature: Login tests

  @successfull-login
#  Test Case 2:
  Scenario: Login User with correct email and password
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
    And user clicks "Continue"
    And user clicks "Logout"
    And user enters "Login email"
    And user enters "Login password"
    And user clicks "Login"
    Then user sees "Loggedin userName"
    And user clicks "Delete account"

  @unsuccessfull-login
#  Test Case 3:
  Scenario: Login User with incorrect email and password
    Given user is on home page
    When user clicks "Signup/Login"
    And user enters "Incorrect login email"
    And user enters "Incorrect login password"
    And user clicks "Login"
    Then user sees "Your email or password is incorrect!"

