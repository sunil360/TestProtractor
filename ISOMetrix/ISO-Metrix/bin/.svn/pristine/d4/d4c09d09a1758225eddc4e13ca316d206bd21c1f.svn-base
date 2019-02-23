package com.isometrix.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.isometrix.selenium.framework.BasePage;
import com.isometrix.selenium.framework.Configuration;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}	
	
	@FindBy(id="txtUsername")
	public WebElement userNameField;

	@FindBy(css = "#txtPassword")
	public WebElement passwordField;

	@FindBy(id = "btnLoginSubmit")
	private WebElement signInButton;
	
	@FindBy (id = "lblAccess")
	private WebElement requestAccessButton;
	
	@FindBy (id = "lblForgot")
	private WebElement resetpasswordButton;
	
	@FindBy (id = "txtAlert")
	private WebElement alertMsg;
	
	@FindBy (css = ".item.logout")
	private WebElement logOut;
	
	public HomePage login(String username, String password) throws Exception
	{
	   String userName = Configuration.readApplicationFile(username);
	   String pwd = Configuration.readApplicationFile(password);
	   setWaitTimeToZero(getDriver());
	   inputText(userNameField,userName);
	   inputText(passwordField,pwd);
	   clickOn(signInButton);
	   return PageFactory.initElements(getDriver(),HomePage.class);
	 }
	
	
	public void verifyLogin() throws Exception
	{
		verifyElementPresent(logOut);
	 }
	
	public void verifyInvalidLogin() throws Exception
	{
		verifyElementPresent(alertMsg);
	 }

	
}
