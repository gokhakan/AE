Feature: Contact us tests
  @contact
#  Test Case 6: Contact Us Form
  Scenario: Contact Us Form
    Given user is on home page
    When user clicks "Contact us"
    Then user sees "Get In Touch"
    And user enters "Contact name"
    And user enters "Contact email"
    And user enters "Subject"
    And user enters "Message"
    And user uploads "File"
    And user clicks "Submit"
    Then user sees "Success! Your details have been submitted successfully"
    And user clicks "Home"
