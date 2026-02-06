Feature: In this SMS Farmer Advisory module we should able to select the required template to send sms to farmers

  Scenario Outline: User is able to log in after handling captcha

    Given the user is on the website login page
    When the user enters a valid username <username> and password <password>
    And the user completes the captcha verification
    And the user clicks on the login button
    Then the user should be logged in successfully
    And user should be able to click on the SMS module
    Then user should be able to click on year dropdown
    And user select their required option
    Then user should be able to click on season dropdown
    And user select their required season crop
    Then user click on department dropdown
    And user select value in department dropdown
    Then user click on group names dropdown
    And select value in group names dropdown
    Then user click on crop names dropdown
    And select value in crop names dropdown
    Then user click on broadcast dropdown
    And select value on broadcast dropdown
    Then user should able to select the master template










    Examples:
      |username   |  password    |
      | "hq_user" | "Apaims@123" |

