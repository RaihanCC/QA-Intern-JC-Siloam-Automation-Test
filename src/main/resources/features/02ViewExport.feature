Feature: Check view and export functionality
  Scenario: Login admin with valid username and password
    Given User access valid url
    When User enter valid admin username
    And User enter valid admin password
    And User click button login
    Then User should see text title page home admin

  Scenario: View and export page admin
    When User click View and Export page
    Then User should see text title page View and Export admin

  Scenario: View and export with valid start and end date admin
    When User pick a start date
    And User pick an end date
    And User click filter button
    Then User should see grid view of the data

  Scenario: Export with valid start and end date admin
    When User pick a start date
    And User pick an end date
    And User click filter button
    Then User click export button

  Scenario: View and export download with valid start and end date admin
    When User pick a start date
    And User pick an end date
    And User click filter button
    Then User click download button

  Scenario: View and export data view with valid start and end date admin
    When User pick a start date
    And User pick an end date
    And User click filter button
    And User click view button
    Then User should be directed to a new page to view the file

  Scenario: View and export document view with valid start and end date admin
    When User pick a start date
    And User pick an end date
    And User click filter button
    And User click one of the document link
    Then User should see the file online in a new tab

  Scenario: View and export with valid start date but no end date admin
    When User pick a start date
    And User click filter button
    Then User should see text alert to fill the end date

  Scenario: View and export with valid end date but no start date admin
    When User pick an end date
    And User click filter button
    Then User should see text alert to fill the start date

  Scenario: View and export with no start and end date admin
    When User click filter button
    Then User should see text alert to fill the start date

  Scenario: View and export export with no start and end date admin
    When User click View and Export page
    And User click export button
    Then User should see text alert to fill the start and end date

  Scenario: View and export download with no start and end date admin
    When User click View and Export page
    And User click download button
    Then User should see text alert to fill the start and end date

  Scenario: User export data with a date range exceeding 31 days admin
    When User pick a start date 2 months ago from today date
    And User pick today date as the end date
    And User click filter button
    And User click export button
    Then User should see text alert to only select a date range up to 31 days back

  Scenario: User download data with a date range exceeding 31 days admin
    When User pick a start date 2 months ago from today date
    And User pick today date as the end date
    And User click filter button
    And User click download button
    Then User should see text alert to only select a date range up to 31 days back

  Scenario: Reset
    When User click refresh button
    Then The page reloading