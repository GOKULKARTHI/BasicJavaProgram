Feature: User Login
  As a user (author/reviewer/staff),
  I want to login to the submission system
  So that I can access my specific area and complete assigned tasks.

  Scenario: User provides valid credentials
    Given User opens the browser
    When User is on the login page
    And User enter valid username/email <validUsername>
    And User enter valid password <validPassword>
    And User clicks the Sign in button
    Then User should able to  login successfully

  Scenario: User provides invalid credentials
    Given User opens the browser
    When User is on the login page
    And User enter invalid username/email <invalidUsername>
    And User enter invalid password <invalidPassword>
    And User clicks the Sign in button
    Then User should see an appropriate error message

  Scenario: User provides valid username/email amd invalid password
    Given User opens the browser
    When User is on the login page
    And User enter valid username/email <validUsername>
    And User enter invalid password <invalidPassword>
    And User clicks the Sign in button
    Then User should see an appropriate error message for invalid password

  Scenario: User provides invalid username/email amd valid password
    Given User opens the browser
    When User is on the login page
    And User enter invalid username/email <invalidUsername>
    And User enter valid password <validPassword>
    And User clicks the Sign in button
    Then User should see an appropriate error message for invalid username/email

  Scenario: User provides only valid Username/email information
    Given User opens the browser
    When User is on the login page
    And User enter valid username/email <validUsername>
    And User dont enter valid password
    And User clicks the Sign in button
    Then User should see an appropriate error message for password missing information

  Scenario: User provides only valid password information
    Given User opens the browser
    When User is on the login page
    And User dont enter valid Username/email
    And User enter valid password <validPassword>
    And User clicks the Sign in button
    Then User should see an appropriate error message for Username/email missing information

  Scenario: User provides no login information
    Given User opens the browser
    When User is on the login page
    And User dont enter valid Username/email
    And User dont enter valid password
    And User clicks the Sign in button
    Then User should see an appropriate error message for  missing information
