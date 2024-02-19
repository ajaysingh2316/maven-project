
@all @booking
Feature: Ticket Booking
  This file covers the following scenerios
  1. No busses found
  2.one busses found
  3. Multiple busses found

  @sanity @negative
  Scenario: No busses found
  Given I log into redbus .in as a user
  When  I update the source as "Jaipur"
  And  I update the destination as " Chennai"
  And  I choose the date as 4th of next month
  And I click on Search Busses
  Then I should get the message as "oops ! No Busses  Found'

  @smoke @positive
  Scenario Outline: One bus found
    Given I log into redbus .in as a user
    When  I update the source as "<src>"
    And  I update the destination as " <dst>"
    And  I choose the date as 4th of next month
    And I click on Search Busses
    Then I should see one bus Available
    Examples:
    |src|dst|
    |Chennai|Bangalore|
    |Bangalore|Hyderabad|