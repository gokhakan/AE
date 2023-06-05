Feature: Verify All Products and product detail page
  @product_details
#  Test Case 8:
  Scenario: Verify product details
    Given user is on home page
    When user clicks "Products"
    Then user is on "Products" page
    And user clicks "product1"
    And user sees "Blue Top"
    And user sees "Category"
    And user sees "Price"