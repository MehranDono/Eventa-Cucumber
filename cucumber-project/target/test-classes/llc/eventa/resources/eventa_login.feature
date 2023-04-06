Feature: Eventa Login Automation
    As an automation test engineer I want to automate Eventa Enterprise web aplication.

  
  Scenario: Successfull logging in as an Organizer
    Given I land on eventa landing page
    When I type in username and password
    Then I expect to see matching username
