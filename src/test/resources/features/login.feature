
@tag
Feature: Test login functionality
 Scenario Outline: login fail
    Given browser is open.
    And user is on demoblaze page.
    And click on login button.
    When user enters <username> and <password> 
    And user clicks on login.
    Then error message displays.
   
 Examples: 
    | username | password |
    | sree | 590ghtr | 
    | hemalatha | kihr4576 |
