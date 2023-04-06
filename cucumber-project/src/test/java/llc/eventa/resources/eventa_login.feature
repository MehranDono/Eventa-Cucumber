Feature: Eventa Login Automation
    As an automation test engineer I want to automate Eventa Enterprise web aplication.

    Background: Opening browser and landing on eventa application page
    Given I open chrome browser
    And I navigate to eventa landing page




  Scenario: Successfull logging in as an Organizer
    When I type in username and password
    Then I expect to see matching username
