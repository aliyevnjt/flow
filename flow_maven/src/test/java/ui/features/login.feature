Feature: Flow Login

 @login
  Scenario: Login with correct credentials
    Given User is on the login page
    And User logs in application with username "matt" and password "matt"
