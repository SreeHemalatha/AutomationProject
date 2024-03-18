
@tag
Feature: Test login functionality
 Scenario Outline: login fail
    Given browser is open.
    And user is on demoblaze page.
    And user selects login.
    When user enters <username> and <password>
    And user clicks on login.
    Then verify error message.
    
     Examples:
    | username | password |
    | sree | 590ghtr |
