@login
Feature: The login page verification

  Background: Student is on the login page
    Given i am on login page
    Given i accept cookies
  Scenario: Student login to Campus with valid data
    When i enter userEMail
    When i enter UserPassword
    When i click button
    Then i am on user courses page

  Scenario Outline: :Student login to Campus with invalid data
    When i enter user "<invalidUsername>"
    And i enter user password "<invalidPasword>"
    When i click button
    Then i should be able to see Invalid username or password

    Examples:
      | invalidUsername | invalidPasword |
      | aaa@bbb.com     | invalidaaaaaaa |
      | cc@ddd .com     | 12321aa        |
