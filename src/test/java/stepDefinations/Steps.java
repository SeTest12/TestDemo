package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {

/*	@Given("^User launch chrome browser$")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		page = new LoginPage(driver);
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@When("^User enters mail as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_mail_as_and_Password_as(String email, String password) throws InterruptedException {
		page.setUserName(email);
		page.setPassword(password);

	}

	@When("^Clicks on Login$")
	public void clicks_on_Login() throws InterruptedException {
		page.clickLogin();
	}
	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) {
		if(driver.getPageSource().contains("Login was unsuccesful.")) {
			driver.close();
			Assert.assertTrue(false);
		}else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("^User clicks on Logout link$")
	public void user_clicks_on_Logout_link() throws InterruptedException {
		page.clickLogout();
		Thread.sleep(5000);
	}

	@Then("^Close browser$")
	public void close_browser() {
		driver.quit();
	}
*/
	
	@Given("^User launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		page = new LoginPage(driver);
	}

	@When("^User opens the URL \"([^\"]*)\"$")
	public void user_opens_the_URL(String url) throws Throwable {
		driver.get(url);
	}

	@When("^User enters email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_Password_as(String email, String password) throws Throwable {
		page.setUserName(email);
		page.setPassword(password);
	}

	@When("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		page.clickLogin();
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}

	//Customer feature step definations ...................

	@Then("^User can view Dashboard$")
	public void user_can_view_Dashboard(){
		addCustomer = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCustomer.getPageTitle());
	}

	@When("^User click on Customer Menu$")
	public void user_click_on_Customer_Menu() throws InterruptedException{
		Thread.sleep(3000);
		addCustomer.clickOnCustomerMenu();
	}

	@When("^Click on Customers Menu item$")
	public void click_on_Customers_Menu_item() throws InterruptedException{
		Thread.sleep(2000);
		addCustomer.clickOnCustomerMenuItem();
	}

	@When("^Click on Add new button$")
	public void click_on_Add_new_button() throws InterruptedException{
		Thread.sleep(3000);
		addCustomer.clickOnAddNew();

	}

	@Then("^User can view Add new customer page$")
	public void user_can_view_Add_new_customer_page(){
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCustomer.getPageTitle());

	}

	@When("^User enter the customer info$")
	public void user_enter_the_customer_info() throws InterruptedException{
		String email = randomString()+"@gmail.com";
		addCustomer.setEmail(email);
		addCustomer.setPassword("Test123");
	/*	addCustomer.setCustomerRoles("Vendors");
		Thread.sleep(3000);*/

		addCustomer.setMgrVendor("Vendor 2");
		addCustomer.setGendor("Male");
		addCustomer.setFirstName("Jhonshon");
		addCustomer.setLastName("Jhon");
		addCustomer.setDob("07/20/1984");
		addCustomer.setCompanyName("CucumberWIthSeleniumTest");
		addCustomer.setAdminContent("This is for Testing......");
	}

	@When("^Click on Save button$")
	public void click_on_Save_button() throws InterruptedException{
		addCustomer.clickOnSave();
		Thread.sleep(2000);
	}

	@Then("^User can view confirmtion page \"([^\"]*)\"$")
	public void user_can_view_confirmtion_page(String message){
//		System.out.println("Message............"+driver.findElement(By.tagName("body")).getText());
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	}

}
