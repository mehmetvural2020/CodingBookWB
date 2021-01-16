Feature: CodingBook Main Page
  Scenario: Test CodingBook Logo
    Given User opens CodingBook web page
    When User checks if CodingBook logo is visible on the top left corner
    And User clicks CodingBook logo
    Then Test if user landed CodingBook homepage

#  Scenario: Test CodingBook LinkedIn icon
#    Given User opens CodingBook web page1
#    When User checks if CodingBook LinkedIn icon is visible on the top right corner
#    And User clicks CodingBook LinkedIn icon
#    Then Test if user landed CodingBook LinkedIn page
#
#  Scenario: Test CodingBook Test Automation sub-menu under Courses menu
#    Given User lands to Courses menu on CodingBook web page
#    When User moves mouse to Test Automation sub-menu under Courses menu
#    And User clicks Test Automation sub-menu
#    Then Test if user landed Test Automation page