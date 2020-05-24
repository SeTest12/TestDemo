Feature: Login

Scenario: Successful Login with valid credentials
	Given  User launch chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters mail as "admin@yourstore.com" and Password as "admin"
	And Clicks on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User clicks on Logout link
  Then Page Title should be "Your store. Login"
  And Close browser
  
Scenario Outline: Login Data Driven
	Given  User launch chrome browser
	When User opens URL "http://admin-demo.nopcommerce.com/login"
	And User enters mail as "<email>" and Password as "<password>"
	And Clicks on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User clicks on Logout link
  Then Page Title should be "Your store. Login"
  And Close browser
	
		Examples:
				| email | password|
				| admin@yourstore.com | admin | 
				| admin@yourstore.com | admin123 |