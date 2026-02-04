Feature: In this SMS Farmer Advisory module we should able to select the required template to send sms to farmers

  Scenario Outline: User is able to log in after handling captcha

    Given the user is on the website login page
    When the user enters a valid username <username> and password <password>
    And the user completes the captcha verification
    And the user clicks on the login button
    Then the user should be logged in successfully
    And user should be able to click on the SMS module







    Examples:
      |username   |  password    |
      | "hq_user" | "Apaims@123" |

