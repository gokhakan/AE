Feature: Verify Test Cases Page
  @test_cases
#  Test Case 7:
  Scenario: Verify Test Cases are visible
    Given user is on home page
    When user clicks "Test Cases"
    Then user is on "Test Cases" page