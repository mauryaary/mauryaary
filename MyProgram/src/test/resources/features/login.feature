Feature: Login Feature

  Scenario: Valid Login
    Given User launches browser
    When User enters username "admin"
    And User enters password "admin123"
    Then User clicks login button