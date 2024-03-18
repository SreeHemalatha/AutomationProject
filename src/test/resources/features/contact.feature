#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: contact feature
  
  @tag1
  Scenario: contact scenario with different sets of data
    Given user navigates to contact page
    When user fills the contact form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on send button
    Then validate the outcome
   
  
    
 Examples:
|SheetName|RowNumber|
|contactus|0|
|contactus|1|
|contactus|2|
