$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Customer.feature");
formatter.feature({
  "line": 1,
  "name": "Login to the nopCommerce application",
  "description": "",
  "id": "login-to-the-nopcommerce-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Sucessful Login to the application with valid creadentials",
  "description": "",
  "id": "login-to-the-nopcommerce-application;sucessful-login-to-the-application-with-valid-creadentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens the URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on Customer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Customers Menu item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter the customer info",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User can view confirmtion page \"The new customer has been added succesfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 20789654700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com/login",
      "offset": 20
    }
  ],
  "location": "Steps.user_opens_the_URL(String)"
});
formatter.result({
  "duration": 4267170200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 1658311500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 14321749700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 365389600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_click_on_Customer_Menu()"
});
formatter.result({
  "duration": 3371117300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Customers_Menu_item()"
});
formatter.result({
  "duration": 15414730900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "duration": 7823656400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "duration": 23493000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_the_customer_info()"
});
formatter.result({
  "duration": 9034172300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Save_button()"
});
formatter.result({
  "duration": 8599224400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added succesfully",
      "offset": 32
    }
  ],
  "location": "Steps.user_can_view_confirmtion_page(String)"
});
formatter.result({
  "duration": 2102000100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "duration": 2249100200,
  "status": "passed"
});
});