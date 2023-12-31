@homework1
Feature: home_work1

  Scenario Outline: user should be able to login with manager "<credentials>"
  Given user navigates to "https://bluerentalcars.com/"
  Then user click on the login page
  Then user enter username "<username>"
  Then user enter password "<password>"
  And click on the login button
  Then verify the login is successful
    And close the application

    Examples: credentials
      | username                       | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |

