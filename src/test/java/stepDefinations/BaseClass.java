package stepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage page;
	public AddCustomerPage addCustomer;
	
// Created for generating random string fro unique email id
	public static String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
}
