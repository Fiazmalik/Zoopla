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
Feature: Search property
  I will use this to search property on zoopla.com

Background:
 Given user is already on searching page
  @Smoke
  Scenario: user can search property
    When User enter a searching value in search field
    And User click on the search button
    And User should see all properties list
    And user clicks on some proeprty
    Then user should navigate to next page to see all details
    
    @Sanity
    Scenario: user cannot search property
    When User does't enter a searching value in search field
    And User click on the search button
    Then User should not see all properties list
   

  