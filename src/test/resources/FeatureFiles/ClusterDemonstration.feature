Feature: data

  After login successfully user able to cross verify the data

  Scenario Outline: user is exploring and cross verifying the data

    Given the user is on the website login page
    When the user enters a valid username <username> and password <password>
    And the user completes the captcha verification
    And the user clicks on the login button
    Then the user should be logged in successfully
    Then close the Mobile Number Not Verified pop up
    Then Click on ClusterDemonstration icon
    Then Click on ClusterDemonstration Tab
    #Then Click on ClusterDemonstration MIS
    Then Click on ClusterDemonstration District Target Report
    Then Click on ClusterDemonstration Mandal Target Report

#    Then the user clicks on the schemes module


    Examples:
      | username         | password     |
      | "state_sao"      | "Apaims@123" |