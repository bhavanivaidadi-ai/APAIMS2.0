Feature: data

  After login successfully user able to cross verify the data

  Scenario Outline: user is exploring and cross verifying the data

    Given the user is on the website login page
    When the user enters a valid username <username> and password <password>
    And the user completes the captcha verification
    And the user clicks on the login button
    Then the user should be logged in successfully
    Then close the Mobile Number Not Verified pop up
    And Click on M&E icon

#    Then the user clicks on the schemes module


    Examples:
      | username         | password     |
      | "test_state_aso" | "apaims@123" |