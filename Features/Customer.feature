Feature: Login to the nopCommerce application

  Scenario: Sucessful Login to the application with valid creadentials
    Given User launch the chrome browser
    When User opens the URL "http://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And user clicks on Login button
    Then User can view Dashboard
    When User click on Customer Menu
    And Click on Customers Menu item
    And Click on Add new button
    Then User can view Add new customer page
    When User enter the customer info
    And Click on Save button
    Then User can view confirmtion page "The new customer has been added succesfully"
    And Close the browser
