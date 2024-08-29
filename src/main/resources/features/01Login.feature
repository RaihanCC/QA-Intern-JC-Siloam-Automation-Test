Feature: Check login functionality
  Scenario: User access invalid url
    Given User access invalid url
    Then User should see text not found

  Scenario: User access valid url
    Given User access valid url
    Then User should see text home login

  Scenario: Login admin no username and password
    When User click button login
    Then User should see text alert

  Scenario: Login admin with valid username and invalid password //
    Given User access valid url
    When User enter valid admin username
    And User enter invalid admin password
    And User click button login
    Then User should see warning text

  Scenario: Login admin with invalid username and valid password
    When User enter invalid admin username
    And User enter valid admin password
    And User click button login
    Then User should see warning text

  Scenario: Login admin with valid username
    When User enter valid admin username
    And User click button login
    Then User should see text alert

  Scenario: Login admin with invalid username
    When User enter invalid admin username
    And User click button login
    Then User should see text alert

  Scenario: Login admin with valid password
    When User enter valid admin password
    And User click button login
    Then User should see text alert

  Scenario: Login admin with invalid password
    When User enter invalid admin password
    And User click button login
    Then User should see text alert

  Scenario: Login admin with valid username and password
    When User enter valid admin username
    And User enter valid admin password
    And User click button login
    Then User should see text title page home admin

  Scenario: Logout admin
    When User click profile
    And User click button logout
    Then User should see text home login

  Scenario: User access invalid url
    Given User access invalid url
    Then User should see text not found

  Scenario: User access valid url
    Given User access valid url
    Then User should see text home login

  Scenario: Login admin no username and password
    When User click button login
    Then User should see text alert

  Scenario: Login sales with valid username and invalid password
    When User enter valid sales username
    And User enter invalid sales password
    And User click button login
    Then User should see warning text

  Scenario: Login sales with invalid username and valid password
    When User enter invalid sales username
    And User enter valid sales password
    And User click button login
    Then User should see warning text

  Scenario: Login sales with valid username
    When User enter valid sales username
    And User click button login
    Then User should see text alert

  Scenario: Login sales with invalid username
    When User enter invalid sales username
    And User click button login
    Then User should see text alert

  Scenario: Login sales with valid password
    When User enter valid sales password
    And User click button login
    Then User should see text alert

  Scenario: Login sales with invalid password
    When User enter invalid sales password
    And User click button login
    Then User should see text alert

  Scenario: Login sales with valid username and password
    When User enter valid sales username
    And User enter valid sales password
    And User click button login
    Then User should see text title page home sales

  Scenario: Logout admin
    When User click profile
    And User click button logout
    Then User should see text home login