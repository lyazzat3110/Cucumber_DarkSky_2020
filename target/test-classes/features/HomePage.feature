@darkSky

Feature: DarkSky  Feature

  Background:
    Given I am on DarkSky Home Page
  @homePage
  Scenario:Verify today's temperature
    When I click on Today and expand it
    Then I verify lowest and highest temp is displayed correctly



