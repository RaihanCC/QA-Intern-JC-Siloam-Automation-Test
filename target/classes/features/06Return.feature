Feature: Check view and export functionality
  Scenario: Login sales with valid username and password
    Given User access valid url
    When User enter valid sales username
    And User enter valid sales password
    And User click button login
    Then User should see text title page home sales

  Scenario: Return page sales
    When User click Return page
    Then User should see text title page Return sales

  Scenario: Return with valid start and end date sales
    When User pick a start date sales
    And User pick an end date sales
    And User click filter button sales
    Then User should see grid view of the data sales

  Scenario: User reset return data sales
    When User click reset button
    Then The data reset to the default

  Scenario: User search a data
    When User type the data in search box
    And User click the search button
    Then User should see the data they are looking for

  Scenario: Reset
    When User click refresh button sales
    Then The return page reloading

  Scenario: Next page
    When User click the next page button
    Then User will move to the next page

  Scenario: Previous page
    When User click the previous button
    Then User will go back to the previous page

  Scenario: User selects different options for the number of entries to display
    When User selects to display twenty five entries
    Then Data displayed should match the selected option of Twenty Five entries

  Scenario: Bottom to top page
    When User click buttom to top button
    Then User directed to the very top of the page

  Scenario: View data
    When User click aksi button
    Then User will redirected to upload document in Form Input page

  Scenario: Logout sales
    When User click profile sales
    And User click button logout sales
    Then User should see text home login