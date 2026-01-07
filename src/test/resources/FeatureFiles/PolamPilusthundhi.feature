Feature: user able to verify the data entered by mobile view

  After login successfully user able to cross verify the data entered in mobile view
  and explored the overall view in the login


  Scenario Outline: user is exploring and cross verifying the data after entering through mobile

    Given the user is on the website login page
    When the user enters a valid username <username> and password <password>
    And the user completes the captcha verification
    And the user clicks on the login button
    Then the user should be logged in successfully
#    Then the user clicks on the schemes module


    Examples:
      | username   | password     |
      | "mao_4887" | "Apaims@123" |