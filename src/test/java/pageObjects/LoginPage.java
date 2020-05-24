package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;


	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String uname) throws InterruptedException {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String password) throws InterruptedException {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void clickLogin() throws InterruptedException {
		btnLogin.click();
	}

	public void clickLogout() throws InterruptedException {
		lnkLogout.click();
	}

}
