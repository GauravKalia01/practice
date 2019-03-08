Feature: Verify log in functionality

  Scenario: Log in application

    Given I have a username and password
    When I have entered a credentials
    Then I logged in successfully