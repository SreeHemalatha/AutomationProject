
@tag
Feature: Test login functionality
 Scenario outline: login fail
    Given browser is open.
    And user is on demoblaze page.
    And click on login button.
    When user enters"<username>"and "<password>"  
    Anduser clicks on login
    Then error message displays.
   
 
    Examples: 
      | username | password |
      |sree      |  590ghtr | 
      |hemalatha | kihr4576 |