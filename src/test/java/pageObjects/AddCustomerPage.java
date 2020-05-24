package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	By lnkCustmoers_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By lnkCustomers_menuItem = By.xpath("//span[@class='menu-item-title'][contains(text(), 'Customers')]");
	By btnAddNew = By.xpath("//a[@class='btn bg-blue']");
	By txtEmail = By.xpath("//input[@id='Email']");
	By txtPassword = By.xpath("//input[@id='Password']");
	By txtFirstName = By.xpath("//input[@id='FirstName']");
	By txtLastName = By.xpath("//input[@id='LastName']");
	By rdFemaleGender = By.id("Gender_Female");
	By rdMaleGender = By.id("Gender_Male");
	By txtCompany = By.xpath("//input[@id='Company']");
	By txtCustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By lstItemAdministrators = By.xpath("//li[contains(text(),'Administartors']");
	By lstItemRegisterd = By.xpath("//li[contains(text(),'Registered']");
	By lstItemGuests = By.xpath("//li[contains(text(),'Guests']");
	By lstItemVendors = By.xpath("//li[contains(text(),'Vendors']");

	By drpMgrOfVendor = By.xpath("//select[@id='VendorId']");
	By lstVendor1 = By.xpath("//li[contains(text(),'Vendor1']");
	By lstVendor2 = By.xpath("//li[contains(text(),'Vendor2']");
	By txtDateofBirth = By.xpath("//input[@id='DateOfBirth']");
	By txtAdminContent = By.xpath("//textarea[@id='AdminComment']");

	By btnSave = By.xpath("//button[@name='save']");

	// Action Methods

	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void clickOnCustomerMenu() {
		ldriver.findElement(lnkCustmoers_menu).click();
	}
	public void clickOnCustomerMenuItem() {
		ldriver.findElement(lnkCustomers_menuItem).click();
	}
	public void clickOnAddNew() {
		ldriver.findElement(btnAddNew).click();
	}
	public void setEmail(String email) {
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	public void setPassword(String password) {
		ldriver.findElement(txtPassword).sendKeys(password);
	}
	public void setCustomerRoles(String role) {
		/*if(!role.equals("Vendors")){
			ldriver.findElement(By.xpath("//li[@class='k-button']//span[contains(text(),'Registered')]")).click();
		}*/

		ldriver.findElement(txtCustomerRoles).click();
		WebElement lstItem;
		if(role.equals("Administrators")) {
			lstItem = ldriver.findElement(lstItemAdministrators);
		}
		else if(role.equals("Registered")) {
			lstItem = ldriver.findElement(lstItemRegisterd);
		}
		else if(role.equals("Vendors")) {
			lstItem = ldriver.findElement(lstItemVendors);
		}
		else {
			lstItem = ldriver.findElement(lstItemGuests);
		}

		//lstItem.click();

		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("argument[0].click();", lstItem);
	}
	public void setMgrVendor(String value) {
		Select select = new Select(ldriver.findElement(drpMgrOfVendor));
		select.selectByVisibleText(value);
	}

	public void setGendor(String gendor) {
		if(gendor.equals("Male")) {
			ldriver.findElement(rdMaleGender).click();
		}else if(gendor.equals("FeMale")) {
			ldriver.findElement(rdFemaleGender).click();
		}else {
			ldriver.findElement(rdMaleGender).click();
		}
	}

	public void setFirstName(String fname) {
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}

	public void setLastName(String lname) {
		ldriver.findElement(txtLastName).sendKeys(lname);
	}

	public void setDob(String dob) {
		ldriver.findElement(txtDateofBirth).sendKeys(dob);
	}

	public void setCompanyName(String companyName) {
		ldriver.findElement(txtCompany).sendKeys(companyName);
	}

	public void setAdminContent(String content) {
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}

	public void clickOnSave() {
		ldriver.findElement(btnSave).click();
	}
}
