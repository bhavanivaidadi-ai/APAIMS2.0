Feature: User Login to Website

  This feature validates that a user can successfully log in to the website by
  entering valid credentials and handling the captcha.


  Scenario Outline: User is able to log in after handling captcha

    Given the user is on the website login page
    #And the login page is loaded successfully
    When the user enters a valid username <username> and password <password>
    #And the user completes the captcha verification
    And the user clicks on the login button

    Then the user should be logged in successfully
    #And the user should be redirected to the home/dashboard page


    Examples:
      | username   | password     |
      | "mao_4887" | "Apaims@123" |